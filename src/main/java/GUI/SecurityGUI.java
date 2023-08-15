package GUI;

import AlarmController.*;
import CameraController.*;
import CameraController.CameraAdjustmentRequest.CameraDirection;
import DoorController.*;
import io.grpc.Context;
import io.grpc.Context.CancellableContext;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import javax.imageio.ImageIO;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SecurityGUI extends JFrame {
    //Service Variables

    //A ten-second deadline for server responses. Requests will terminate after 10 seconds
    //Copied from Sample Project - Smart Health
    private final int DEADLINE = 10;

    //Used to cancel requests
    //Copied from Sample Project - Smart Health
    private CancellableContext cancelRequest;

    //ServiceInfo variables to store data for each service
    private ServiceInfo doorControllerService1Info, cameraControllerService2Info, alarmControllerService3Info;

    //GUI Variables

    //Main Panel
    private JPanel securityControllerGUI;

    //Service Tabs
    private JTabbedPane serviceTabs, doorControlsTabs;
    private JPanel doorControlsJPanel, cameraControlsJPanel, alarmControlsJPanel;

    //Door Controls Tab
    //Door Access Tab
    private JPanel doorAccessJPanel, doorSelectJPanel, securityBadgeJPanel, securityCodeJPanel, doorAccessStatusJPanel;
    private JRadioButton door1RadioButton, door2RadioButton;
    private JButton sBadge1Button, sBadge2Button, sBadge3Button, sBadge4Button, doorCodeSubmitButton;
    private JTextField securityCodeInput, doorAccessStatus;
    String doorID = "door1";


    //Intercom Controls Tab
    private JPanel intercomControlsJPanel, userCallJPanel, securityResponseJPanel, intercomJPanel;
    private JButton callSecurityButton, answerButton, rejectButton, intercomButton;
    private JTextField callSecurityStatus, intercomStatus;

    //Camera Controls Tab
    private JPanel cameraControllerJPanel, cameraSelectJPanel, directionControlsJPanel, motionDetectorJPanel, cameraScreenJPanel, cameraAutomationJPanel;
    private JRadioButton camera1RadioButton, camera2RadioButton;
    private JButton upButton, leftButton, rightButton, downButton, motionLocationSubmitButton, cameraAutomationButton;
    private JTextField cameraPositionDisplay, inputDetectedMotionLocation, motionDetectedStatus, motionLocationStatus, automatedCameraPosition;
    String cameraID = "camera1";
    String automatedCameraID = "camera2";
    String camera1Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2); //B2
    String camera2Position = automatedCameraPosition.getText().substring(automatedCameraPosition.getText().length() - 2); //B2

    //Alarm Controls Tab
    private JPanel manualAlarmJPanel, fireSuppressionJPanel, emergencyServicesCallJPanel, alarmButtonsJPanel, alarmResponseJPanel, sensorButtonsJPanel, sensorResponseJPanel, escButtonJPanel, escResponseJPanel, alarmCheckJPanel, alarmCheckButtonJPanel, alarmResetJPanel;
    private JButton alarm1Button, alarm2Button, alarm3Button, securitySensorButton, fireSensorButton, alarm4Button, alarmCheckButton, alarmResetButton;
    private JTextField alarmActivatedAlarmTest, emergencyLightsAlarmTest, emergencySirensAlarmTest, emergencyLightsFSTest, emergencySirensFSTest, fireSuppressionFSTest, emergencyServicesCallTestStatus;
    private JTextArea alarmCheckInfo;
    private JButton resetDoorStatus;
    private JPanel cameraScreenJPanel2;

    //GUI Methods

    public SecurityGUI() {
        //Discovers all registered services
        discoverJMDNSServices();

        System.out.println("Launching Security GUI");

        //Creates GUI
        setContentPane(securityControllerGUI);
        setTitle("Security GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1280, 900);
        setLocationRelativeTo(null);
        setVisible(true);

        door1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doorID = "door1";
                securityCodeInput.setText("");
                doorAccessStatus.setText("Status: ");
                sBadge1Button.setEnabled(true);
                sBadge2Button.setEnabled(true);
                sBadge3Button.setEnabled(true);
                sBadge4Button.setEnabled(true);
                doorCodeSubmitButton.setEnabled(true);
            }
        });

        door2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doorID = "door2";
                securityCodeInput.setText("");
                doorAccessStatus.setText("Status: ");
                sBadge1Button.setEnabled(true);
                sBadge2Button.setEnabled(true);
                sBadge3Button.setEnabled(true);
                sBadge4Button.setEnabled(true);
                doorCodeSubmitButton.setEnabled(true);
            }
        });

        sBadge1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                doorAccessStatus.setText("Status: ");

                //Disabling buttons
                sBadge1Button.setEnabled(false);
                sBadge2Button.setEnabled(false);
                sBadge3Button.setEnabled(false);
                sBadge4Button.setEnabled(false);
                doorCodeSubmitButton.setEnabled(false);

                System.out.println("\nDoor Access: Swiping Badge 1");
                ManagedChannel doorControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub doorControlsBlockingStub = Service1Grpc.newBlockingStub(doorControlsChannel);
                ScanSecurityBadgeRequest scanSecurityBadgeRequest = ScanSecurityBadgeRequest.newBuilder().setDoorID(doorID).setBadgeID("badge1").build();
                try {
                    ScanSecurityBadgeResponse scanSecurityBadgeResponse = doorControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).scanSecurityBadge(scanSecurityBadgeRequest);
                    doorAccessStatus.setText(doorAccessStatus.getText() + scanSecurityBadgeResponse.getValid());
                } catch (StatusRuntimeException sre) {
                    doorAccessStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                doorControlsChannel.shutdown();
                System.out.println("Door Access: Request Complete");
            }
        });

        sBadge2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                doorAccessStatus.setText("Status: ");

                //Disabling buttons
                sBadge1Button.setEnabled(false);
                sBadge2Button.setEnabled(false);
                sBadge3Button.setEnabled(false);
                sBadge4Button.setEnabled(false);
                doorCodeSubmitButton.setEnabled(false);

                System.out.println("\nDoor Access: Swiping Badge 2");
                ManagedChannel doorControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub doorControlsBlockingStub = Service1Grpc.newBlockingStub(doorControlsChannel);
                ScanSecurityBadgeRequest scanSecurityBadgeRequest = ScanSecurityBadgeRequest.newBuilder().setDoorID(doorID).setBadgeID("badge2").build();
                try {
                    ScanSecurityBadgeResponse scanSecurityBadgeResponse = doorControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).scanSecurityBadge(scanSecurityBadgeRequest);
                    doorAccessStatus.setText(doorAccessStatus.getText() + scanSecurityBadgeResponse.getValid());
                } catch (StatusRuntimeException sre) {
                    doorAccessStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                doorControlsChannel.shutdown();
                System.out.println("Door Access: Request Complete");
            }
        });

        sBadge3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                doorAccessStatus.setText("Status: ");

                //Disabling buttons
                sBadge1Button.setEnabled(false);
                sBadge2Button.setEnabled(false);
                sBadge3Button.setEnabled(false);
                sBadge4Button.setEnabled(false);
                doorCodeSubmitButton.setEnabled(false);

                System.out.println("\nDoor Access: Swiping Badge 3");
                ManagedChannel doorControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub doorControlsBlockingStub = Service1Grpc.newBlockingStub(doorControlsChannel);
                ScanSecurityBadgeRequest scanSecurityBadgeRequest = ScanSecurityBadgeRequest.newBuilder().setDoorID(doorID).setBadgeID("badge3").build();
                try {
                    ScanSecurityBadgeResponse scanSecurityBadgeResponse = doorControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).scanSecurityBadge(scanSecurityBadgeRequest);
                    doorAccessStatus.setText(doorAccessStatus.getText() + scanSecurityBadgeResponse.getValid());
                } catch (StatusRuntimeException sre) {
                    doorAccessStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                doorControlsChannel.shutdown();
                System.out.println("Door Access: Request Complete");
            }
        });

        sBadge4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                doorAccessStatus.setText("Status: ");

                //Disabling buttons
                sBadge1Button.setEnabled(false);
                sBadge2Button.setEnabled(false);
                sBadge3Button.setEnabled(false);
                sBadge4Button.setEnabled(false);
                doorCodeSubmitButton.setEnabled(false);

                System.out.println("\nDoor Access: Swiping Badge 4");
                ManagedChannel doorControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub doorControlsBlockingStub = Service1Grpc.newBlockingStub(doorControlsChannel);
                ScanSecurityBadgeRequest scanSecurityBadgeRequest = ScanSecurityBadgeRequest.newBuilder().setDoorID(doorID).setBadgeID("badge4").build();
                try {
                    ScanSecurityBadgeResponse scanSecurityBadgeResponse = doorControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).scanSecurityBadge(scanSecurityBadgeRequest);
                    doorAccessStatus.setText(doorAccessStatus.getText() + scanSecurityBadgeResponse.getValid());
                } catch (StatusRuntimeException sre) {
                    doorAccessStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                doorControlsChannel.shutdown();
                System.out.println("Door Access: Request Complete");
            }
        });

        //Submit security code button
        doorCodeSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                doorAccessStatus.setText("Status: ");

                //Disabling buttons
                sBadge1Button.setEnabled(false);
                sBadge2Button.setEnabled(false);
                sBadge3Button.setEnabled(false);
                sBadge4Button.setEnabled(false);
                doorCodeSubmitButton.setEnabled(false);

                System.out.println("\nDoor Access: Submitting Security Code");
                ManagedChannel doorControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub doorControlsBlockingStub = Service1Grpc.newBlockingStub(doorControlsChannel);
                SecurityCodeEntryRequest securityCodeEntryRequest = SecurityCodeEntryRequest.newBuilder().setDoorID(doorID).setSecurityCode(securityCodeInput.getText()).build();

                try {
                    SecurityCodeEntryResponse securityCodeEntryResponse = doorControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).securityCodeEntry(securityCodeEntryRequest);
                    doorAccessStatus.setText(doorAccessStatus.getText() + securityCodeEntryResponse.getValid());

                } catch (StatusRuntimeException sre) {
                    doorAccessStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                securityCodeInput.setText("");
                doorControlsChannel.shutdown();
                System.out.println("Door Access: Request Complete");
            }
        });

        //Reset door status button
        resetDoorStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doorAccessStatus.setText("Status: ");
                securityCodeInput.setText("");
                sBadge1Button.setEnabled(true);
                sBadge2Button.setEnabled(true);
                sBadge3Button.setEnabled(true);
                sBadge4Button.setEnabled(true);
                doorCodeSubmitButton.setEnabled(true);
            }
        });

        //Call security button
        callSecurityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                callSecurityStatus.setText("Status: ");

                //Disabling call button while call in progress
                callSecurityButton.setEnabled(false);

                //Enabling response buttons
                answerButton.setEnabled(true);
                rejectButton.setEnabled(true);
                
                System.out.println("\nIntercom Controls: Calling Security");
                ManagedChannel intercomControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub intercomControlsBlockingStub = Service1Grpc.newBlockingStub(intercomControlsChannel);
                DoorController.Empty intercomCallRequest = DoorController.Empty.newBuilder().build();
                
                try {
                    IntercomCallResponse intercomCallResponse = intercomControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).intercomCall(intercomCallRequest);
                    callSecurityStatus.setText(callSecurityStatus.getText() + intercomCallResponse.getCallResponse());

                } catch (StatusRuntimeException sre) {
                    callSecurityStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                intercomControlsChannel.shutdown();
            }
        });

        //Answer incoming call button
        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                callSecurityStatus.setText("Status: ");

                //Enabling call button
                callSecurityButton.setEnabled(true);

                //Disabling response buttons while no call in progress
                answerButton.setEnabled(false);
                rejectButton.setEnabled(false);

                System.out.println("\nIntercom Controls: Answering Call");
                ManagedChannel intercomControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub intercomControlsBlockingStub = Service1Grpc.newBlockingStub(intercomControlsChannel);
                IntercomAnswerRequest intercomAnswerRequest = IntercomAnswerRequest.newBuilder().setAnswerRequest("answer").build();

                try {
                    IntercomAnswerResponse intercomAnswerResponse = intercomControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).intercomAnswer(intercomAnswerRequest);
                    callSecurityStatus.setText(callSecurityStatus.getText() + intercomAnswerResponse.getAnswerResponse());

                } catch (StatusRuntimeException sre) {
                    callSecurityStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                intercomControlsChannel.shutdown();
                System.out.println("Intercom Controls: Call Answered");
            }
        });

        //Reject incoming call button
        rejectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Resetting status field if necessary
                callSecurityStatus.setText("Status: ");

                //Enabling call button
                callSecurityButton.setEnabled(true);

                //Disabling response buttons while no call in progress
                answerButton.setEnabled(false);
                rejectButton.setEnabled(false);

                System.out.println("\nIntercom Controls: Rejecting Call");
                ManagedChannel intercomControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();
                Service1Grpc.Service1BlockingStub intercomControlsBlockingStub = Service1Grpc.newBlockingStub(intercomControlsChannel);
                IntercomAnswerRequest intercomAnswerRequest = IntercomAnswerRequest.newBuilder().setAnswerRequest("reject").build();

                try {
                    IntercomAnswerResponse intercomAnswerResponse = intercomControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).intercomAnswer(intercomAnswerRequest);
                    callSecurityStatus.setText(callSecurityStatus.getText() + intercomAnswerResponse.getAnswerResponse());

                } catch (StatusRuntimeException sre) {
                    callSecurityStatus.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre);
                }
                intercomControlsChannel.shutdown();
                System.out.println("Intercom Controls: Call Rejected");
            }
        });
        intercomButton.addMouseListener(new MouseAdapter() {
            //Stores the value to be sent to the server
            int callTime = 0;
            //Creates a "ScheduledExecutorService" called "timedExecutor"
            ScheduledExecutorService timedExecutor;

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                intercomStatus.setText("Status: Channel Open");
                System.out.println("\nIntercom: Receiving Message");
                //Executor that will increment the value stored in "callTime" by 1 every second
                timedExecutor = Executors.newScheduledThreadPool(1);
                timedExecutor.scheduleAtFixedRate(timedTransmission, 0, 1, TimeUnit.SECONDS);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                //Shuts down "timedExecutor"
                timedExecutor.shutdown();
                intercomChannel();
            }

            //Simple runnable to be used in an executor service
            Runnable timedTransmission = new Runnable() {
                @Override
                public void run() {
                   callTime++;
                }
            };

            public void intercomChannel() {
                //Create a channel for the intercom
                ManagedChannel intercomControlsChannel = ManagedChannelBuilder.forAddress(doorControllerService1Info.getHostAddresses()[0], doorControllerService1Info.getPort()).usePlaintext().build();

                //Creates an asynchronous stub for the above channel to be used in the client-streaming gRPC
                Service1Grpc.Service1Stub intercomControlAsyncStub = Service1Grpc.newStub(intercomControlsChannel);

                //Prepare a response in the form a stream observer that processes the data streamed from the client
                StreamObserver<OneWayCommunicationResponse> oneWayCommunicationResponseObserver = new StreamObserver<OneWayCommunicationResponse>() {
                    @Override
                    public void onNext(OneWayCommunicationResponse oneWayCommunicationResponse) {
                        intercomStatus.setText("Status: " + oneWayCommunicationResponse.getChannelStatus());

                        //Simulates delayed transmission
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        //Prints an error message to the user and the console
                        intercomStatus.setText("Error: Intercom Call Failed. Please Try Again");
                        System.out.println(throwable.getMessage());
                        throwable.printStackTrace();

                        //Shuts down the channel
                        intercomControlsChannel.shutdown();
                    }

                    @Override
                    public void onCompleted() {
                        intercomStatus.setText("Status: Channel Closed");
                        System.out.println("Intercom: Message Sent");

                        //Shuts down the channel
                        intercomControlsChannel.shutdown();
                    }
                };

                //Preparing the request to be streamed. This uses a custom deadline to accommodate up to 60 second transmissions
                StreamObserver<OneWayCommunicationRequest> oneWayCommunicationRequestObserver = intercomControlAsyncStub.withDeadlineAfter(61, TimeUnit.SECONDS).oneWayCommunication(oneWayCommunicationResponseObserver);

                //Get the current context with cancellation
                cancelRequest = Context.current().withCancellation();

                try {
                    System.out.println("Transmitting Message");
                    //Making multiple requests using a for loop
                    for (int i = 0; i < callTime; i++) {
                        oneWayCommunicationRequestObserver.onNext(OneWayCommunicationRequest.newBuilder().setCallTime(i + 1).build());
                    }
                    System.out.println("Transmission Complete");

                    //Delay between requests
                    Thread.sleep(1000);

                    //End the requests
                    oneWayCommunicationRequestObserver.onCompleted();
                } catch (RuntimeException re) {
                    automatedCameraPosition.setText("Error: Intercom Call Failed. Please Try Again");
                    System.out.println(re.getMessage());
                    re.printStackTrace();
                } catch (InterruptedException ie) {
                    automatedCameraPosition.setText("Error: Intercom Call Failed. Please Try Again");
                    System.out.println(ie.getMessage());
                    ie.printStackTrace();
                }
            }
        });

        camera1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cameraID = "camera1";
                automatedCameraID = "camera2";
                cameraPositionDisplay.setText("Camera Position: " + camera1Position);
                automatedCameraPosition.setText("Automated Camera: Camera 2, " + camera2Position);
                cameraScreenJPanel2.setVisible(false);
                cameraScreenJPanel.setVisible(true);
            }
        });

        camera2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cameraID = "camera2";
                automatedCameraID = "camera1";
                cameraPositionDisplay.setText("Camera Position: " + camera2Position);
                automatedCameraPosition.setText("Automated Camera: Camera 1, " + camera1Position);
                cameraScreenJPanel.setVisible(false);
                cameraScreenJPanel2.setVisible(true);
            }
        });

        //Move camera up button
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Strings to store the camera position
                String cameraPosition;
                //Resets "cameraPositionDisplay" if error message is displayed and stores camera position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    cameraPositionDisplay.setText("Camera Position: " + camera1Position);
                    cameraPosition = camera1Position;
                } else {
                    cameraPositionDisplay.setText("Camera Position: " + camera2Position);
                    cameraPosition = camera2Position;
                }

                //Waits for a moment to simulate camera movement
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                    ie.printStackTrace();
                    cameraPositionDisplay.setText("Error: Camera Resetting");
                }

                //Creates a "CameraDirection" object called "cameraDirection" and stores the value corresponding to the selected direction
                CameraDirection cameraDirection = CameraDirection.forNumber(0);

                //Creating channel with my service's IP address and port
                ManagedChannel cameraAdjustmentChannel = ManagedChannelBuilder.forAddress(cameraControllerService2Info.getHostAddresses()[0], cameraControllerService2Info.getPort()).usePlaintext().build();

                //Creating gRPC blocking stub to prevent multiple camera movements at once
                Service2Grpc.Service2BlockingStub cameraControlsBlockingStub = Service2Grpc.newBlockingStub(cameraAdjustmentChannel);

                //Preparing request
                CameraAdjustmentRequest cameraAdjustmentRequest = CameraAdjustmentRequest.newBuilder().setCameraID(cameraID).setCameraPosition(cameraPosition).setCameraDirection(cameraDirection).build();

                System.out.println("\nCamera Adjustment: Up");
                try {
                    CameraAdjustmentResponse cameraAdjustmentResponse = cameraControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).cameraAdjustment(cameraAdjustmentRequest);
                    cameraPositionDisplay.setText("Camera Position: " + cameraAdjustmentResponse.getCameraPosition());
                } catch (StatusRuntimeException sre) {
                    System.out.println(sre.getMessage());
                    sre.printStackTrace();
                    System.out.println("Error: Camera Resetting");
                }

                //Storing the selected camera's new position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    camera1Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                } else {
                    camera2Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                }

                //Shutting down channel
                cameraAdjustmentChannel.shutdown();

                System.out.println("Camera Adjustment: Complete");
            }
        });

        //Move camera down button
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Strings to store the camera position
                String cameraPosition;
                //Resets "cameraPositionDisplay" if error message is displayed and stores camera position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    cameraPositionDisplay.setText("Camera Position: " + camera1Position);
                    cameraPosition = camera1Position;
                } else {
                    cameraPositionDisplay.setText("Camera Position: " + camera2Position);
                    cameraPosition = camera2Position;
                }

                //Waits for a moment to simulate camera movement
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                    ie.printStackTrace();
                    cameraPositionDisplay.setText("Error: Camera Resetting");
                }

                //Creates a "CameraDirection" object called "cameraDirection" and stores the value corresponding to the selected direction
                CameraDirection cameraDirection = CameraDirection.forNumber(1);

                //Creating channel with my service's IP address and port
                ManagedChannel cameraAdjustmentChannel = ManagedChannelBuilder.forAddress(cameraControllerService2Info.getHostAddresses()[0], cameraControllerService2Info.getPort()).usePlaintext().build();

                //Creating gRPC blocking stub to prevent multiple camera movements at once
                Service2Grpc.Service2BlockingStub cameraControlsBlockingStub = Service2Grpc.newBlockingStub(cameraAdjustmentChannel);

                //Preparing request
                CameraAdjustmentRequest cameraAdjustmentRequest = CameraAdjustmentRequest.newBuilder().setCameraID(cameraID).setCameraPosition(cameraPosition).setCameraDirection(cameraDirection).build();

                System.out.println("\nCamera Adjustment: Down");
                try {
                    CameraAdjustmentResponse cameraAdjustmentResponse = cameraControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).cameraAdjustment(cameraAdjustmentRequest);
                    cameraPositionDisplay.setText("Camera Position: " + cameraAdjustmentResponse.getCameraPosition());
                } catch (StatusRuntimeException sre) {
                    System.out.println(sre.getMessage());
                    sre.printStackTrace();
                    System.out.println("Error: Camera Resetting");
                }

                //Storing the selected camera's new position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    camera1Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                } else {
                    camera2Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                }

                //Shutting down channel
                cameraAdjustmentChannel.shutdown();

                System.out.println("Camera Adjustment: Complete");
            }
        });

        //Move camera left button
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Strings to store the camera position
                String cameraPosition;
                //Resets "cameraPositionDisplay" if error message is displayed and stores camera position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    cameraPositionDisplay.setText("Camera Position: " + camera1Position);
                    cameraPosition = camera1Position;
                } else {
                    cameraPositionDisplay.setText("Camera Position: " + camera2Position);
                    cameraPosition = camera2Position;
                }

                //Waits for a moment to simulate camera movement
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                    ie.printStackTrace();
                    cameraPositionDisplay.setText("Error: Camera Resetting");
                }

                //Creates a "CameraDirection" object called "cameraDirection" and stores the value corresponding to the selected direction
                CameraDirection cameraDirection = CameraDirection.forNumber(2);

                //Creating channel with my service's IP address and port
                ManagedChannel cameraAdjustmentChannel = ManagedChannelBuilder.forAddress(cameraControllerService2Info.getHostAddresses()[0], cameraControllerService2Info.getPort()).usePlaintext().build();

                //Creating gRPC blocking stub to prevent multiple camera movements at once
                Service2Grpc.Service2BlockingStub cameraControlsBlockingStub = Service2Grpc.newBlockingStub(cameraAdjustmentChannel);

                //Preparing request
                CameraAdjustmentRequest cameraAdjustmentRequest = CameraAdjustmentRequest.newBuilder().setCameraID(cameraID).setCameraPosition(cameraPosition).setCameraDirection(cameraDirection).build();

                System.out.println("\nCamera Adjustment: Left");
                try {
                    CameraAdjustmentResponse cameraAdjustmentResponse = cameraControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).cameraAdjustment(cameraAdjustmentRequest);
                    cameraPositionDisplay.setText("Camera Position: " + cameraAdjustmentResponse.getCameraPosition());
                } catch (StatusRuntimeException sre) {
                    System.out.println(sre.getMessage());
                    sre.printStackTrace();
                    System.out.println("Error: Camera Resetting");
                }

                //Storing the selected camera's new position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    camera1Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                } else {
                    camera2Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                }

                //Shutting down channel
                cameraAdjustmentChannel.shutdown();

                System.out.println("Camera Adjustment: Complete");
            }
        });

        //Move camera right button
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Strings to store the camera position
                String cameraPosition;
                //Resets "cameraPositionDisplay" if error message is displayed and stores camera position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    cameraPositionDisplay.setText("Camera Position: " + camera1Position);
                    cameraPosition = camera1Position;
                } else {
                    cameraPositionDisplay.setText("Camera Position: " + camera2Position);
                    cameraPosition = camera2Position;
                }

                //Waits for a moment to simulate camera movement
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                    ie.printStackTrace();
                    cameraPositionDisplay.setText("Error: Camera Resetting");
                }

                //Creates a "CameraDirection" object called "cameraDirection" and stores the value corresponding to the selected direction
                CameraDirection cameraDirection = CameraDirection.forNumber(3);

                //Creating channel with my service's IP address and port
                ManagedChannel cameraAdjustmentChannel = ManagedChannelBuilder.forAddress(cameraControllerService2Info.getHostAddresses()[0], cameraControllerService2Info.getPort()).usePlaintext().build();

                //Creating gRPC blocking stub to prevent multiple camera movements at once
                Service2Grpc.Service2BlockingStub cameraControlsBlockingStub = Service2Grpc.newBlockingStub(cameraAdjustmentChannel);

                //Preparing request
                CameraAdjustmentRequest cameraAdjustmentRequest = CameraAdjustmentRequest.newBuilder().setCameraID(cameraID).setCameraPosition(cameraPosition).setCameraDirection(cameraDirection).build();

                System.out.println("\nCamera Adjustment: Right");
                try {
                    CameraAdjustmentResponse cameraAdjustmentResponse = cameraControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).cameraAdjustment(cameraAdjustmentRequest);
                    cameraPositionDisplay.setText("Camera Position: " + cameraAdjustmentResponse.getCameraPosition());
                } catch (StatusRuntimeException sre) {
                    System.out.println(sre.getMessage());
                    sre.printStackTrace();
                    System.out.println("Error: Camera Resetting");
                }

                //Storing the selected camera's new position
                if (cameraID.equalsIgnoreCase("camera1")) {
                    camera1Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                } else {
                    camera2Position = cameraPositionDisplay.getText().substring(cameraPositionDisplay.getText().length() - 2);
                }

                //Shutting down channel
                cameraAdjustmentChannel.shutdown();

                System.out.println("Camera Adjustment: Complete");
            }
        });

        motionLocationSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Simple Input Validation
                ArrayList<String> validCameraLocations = new ArrayList<>(Arrays.asList("A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3"));
                if (validCameraLocations.contains(inputDetectedMotionLocation.getText())) {
                    System.out.println("\nMotion Detected: " + inputDetectedMotionLocation.getText());
                    motionDetectedStatus.setText("Motion Detector: ");
                    motionLocationStatus.setText("Motion Location: ");
                    ManagedChannel motionDetectorChannel = ManagedChannelBuilder.forAddress(cameraControllerService2Info.getHostAddresses()[0], cameraControllerService2Info.getPort()).usePlaintext().build();
                    Service2Grpc.Service2BlockingStub cameraControlsBlockingStub = Service2Grpc.newBlockingStub(motionDetectorChannel);
                    MotionDetectedRequest motionDetectedRequest = MotionDetectedRequest.newBuilder().setMotionLocation(inputDetectedMotionLocation.getText()).build();
                    try {
                        MotionDetectedResponse motionDetectedResponse = cameraControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).motionDetected(motionDetectedRequest);
                        motionDetectedStatus.setText(motionDetectedStatus.getText() + motionDetectedResponse.getDetectionAlert());
                        motionLocationStatus.setText(motionLocationStatus.getText() + motionDetectedResponse.getMotionLocation());
                        cameraAutomationButton.setEnabled(true);
                    } catch (StatusRuntimeException sre) {
                        inputDetectedMotionLocation.setText("");
                        motionDetectedStatus.setText("Error: Please Try Again");
                        motionLocationStatus.setText("Error: Please Try Again");
                        sre.printStackTrace();
                        cancelRequest.cancel(sre.getCause());
                    }
                    motionDetectorChannel.shutdown();
                    inputDetectedMotionLocation.setText("");
                    System.out.println("Motion Detected: Complete");
                } else {
                    inputDetectedMotionLocation.setText("");
                    motionDetectedStatus.setText("Error: Invalid Input. Please Try Again");
                    motionLocationStatus.setText("Error: Invalid Input. Please Try Again");
                }
            }
        });

        cameraAutomationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nMotion Detected: Calculating Route");
                //Resetting camera automation text field
                if (camera1RadioButton.isSelected()) {
                    automatedCameraPosition.setText("Automated Camera Position: Camera 2, " + camera2Position);
                } else {
                    automatedCameraPosition.setText("Automated Camera Position: Camera 1, " + camera1Position);
                }

                //Creates and channel with the service's IP Address and Port
                ManagedChannel automatedCameraChannel = ManagedChannelBuilder.forAddress(cameraControllerService2Info.getHostAddresses()[0], cameraControllerService2Info.getPort()).usePlaintext().build();

                //Creates an asynchronous stub for the above channel to be used in the bidirectional gRPC
                Service2Grpc.Service2Stub cameraControlsAsyncStub = Service2Grpc.newStub(automatedCameraChannel);

                //CameraAdjustmentResponse Stream Observer
                StreamObserver<CameraAutomationResponse> cameraAutomationResponseObserver = new StreamObserver<CameraAutomationResponse>() {
                    @Override
                    public void onNext(CameraAutomationResponse cameraAutomationResponse) {

                        //Displays the current automated camera position to the user and prints it to the console
                        if (cameraID.equalsIgnoreCase("camera1")) {
                            System.out.println("Moving Camera 2 to " + cameraAutomationResponse.getCameraAutomation());
                            automatedCameraPosition.setText("Automated Camera: Camera 2, " + cameraAutomationResponse.getCameraAutomation());
                        } else {
                            System.out.println("Moving Camera 1 to " + cameraAutomationResponse.getCameraAutomation());
                            automatedCameraPosition.setText("Automated Camera: Camera 1, " + cameraAutomationResponse.getCameraAutomation());
                        }

                        try {
                            //Waits for a moment to simulate camera movement
                            Thread.sleep(1000);

                            //Catches any errors, displays an error message to the user and on the console
                        } catch (RuntimeException re) {
                            automatedCameraPosition.setText("Error: Resetting Automated Camera");
                            System.out.println(re.getMessage());
                            re.printStackTrace();
                        } catch (InterruptedException ie) {
                            automatedCameraPosition.setText("Error: Resetting Automated Camera");
                            System.out.println(ie.getMessage());
                            ie.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        //Displaying error message to user
                        automatedCameraPosition.setText("Error: Resetting Automated Camera");

                        //Printing error to console
                        System.out.println(throwable.getMessage());
                        throwable.printStackTrace();

                        //Shutting down the channel
                        automatedCameraChannel.shutdown();
                    }

                    @Override
                    public void onCompleted() {
                        //Printing end of request message to console
                        System.out.println("Motion Detected: Moving Automated Camera Complete");

                        //Resetting motion detector
                        motionDetectedStatus.setText("Motion Detector: ");
                        motionLocationStatus.setText("Motion Location: ");

                        //Disabling test button until motion is detected again
                        cameraAutomationButton.setEnabled(false);

                        //Storing the automated camera's final position
                        if (cameraID.equalsIgnoreCase("camera1")) {
                            camera2Position = automatedCameraPosition.getText().substring(automatedCameraPosition.getText().length() - 2);
                        } else {
                            camera1Position = automatedCameraPosition.getText().substring(automatedCameraPosition.getText().length() - 2);
                        }

                        //Shutting down channel
                        automatedCameraChannel.shutdown();
                    }
                };

                //Preparing the request
                StreamObserver<CameraAutomationRequest> cameraAutomationRequestObserver = cameraControlsAsyncStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).cameraAutomation(cameraAutomationResponseObserver);

                //Getting automated camera data
                String locationOfMovement = motionLocationStatus.getText().substring(motionLocationStatus.getText().length() - 2);
                String autoCamPosition = automatedCameraPosition.getText().substring(automatedCameraPosition.getText().length() - 2);

                //Plotting automated camera route
                //Variable to store automated camera route & flag to track camera movement and if camera has arrived
                ArrayList<String> automatedCameraRoute = new ArrayList<>();
                ArrayList<Integer> xCoordinates = new ArrayList<>();
                ArrayList<Integer> yCoordinates = new ArrayList<>();
                String cameraMovement = "";

                //Converting into x and y positions
                String locX, locY;
                String camX, camY;
                int cameraX, locationX;
                int cameraY = 0;
                int locationY = 0;
                locX = locationOfMovement.substring(1);
                locY = locationOfMovement.substring(0, 1);
                camX = autoCamPosition.substring(1);
                camY = autoCamPosition.substring(0, 1);
                switch (locY) {
                    case "A":
                        locationY = 0;
                        break;
                    case "B":
                        locationY = 1;
                        break;
                    case "C":
                        locationY = 2;
                        break;
                }
                switch (camY) {
                    case "A":
                        cameraY = 0;
                        break;
                    case "B":
                        cameraY = 1;
                        break;
                    case "C":
                        cameraY = 2;
                        break;
                }
                locationX = Integer.parseInt(locX) - 1;
                cameraX = Integer.parseInt(camX) - 1;

                //Simulates the camera moving towards the location of movement one section at a time
                //Adjust the x position first
                while (cameraX != locationX) {
                    if (cameraX < locationX) {
                        cameraX++;
                    } else {
                        cameraX--;
                    }
                    //Stores the current x and y positions
                    xCoordinates.add(cameraX);
                    yCoordinates.add(cameraY);
                }
                //Then adjust the y position
                while (cameraY != locationY) {
                    if (cameraY < locationY) {
                        cameraY++;
                    } else {
                        cameraY--;
                    }
                    //Stores the current x and y positions
                    xCoordinates.add(cameraX);
                    yCoordinates.add(cameraY);
                }

                //Building camera route and storing it
                for (int i = 0; i < xCoordinates.size(); i++) {
                    //Converting the camera's x and y positions back into their original format and storing them in "cameraMovement"
                    switch (yCoordinates.get(i)) {
                        case 0:
                            cameraMovement = "A";
                            break;
                        case 1:
                            cameraMovement = "B";
                            break;
                        case 2:
                            cameraMovement = "C";
                            break;
                    }
                    cameraMovement += Integer.toString(xCoordinates.get(i) + 1);
                    automatedCameraRoute.add(cameraMovement);
                }

                try {
                    if (!automatedCameraRoute.isEmpty()) {
                        for (int i = 0; i < automatedCameraRoute.size(); i++) {
                            cameraAutomationRequestObserver.onNext(CameraAutomationRequest.newBuilder().setAutomatedCameraID(automatedCameraID).setCameraPosition(automatedCameraRoute.get(i)).setLocationOfMovement(locationOfMovement).build());
                        }
                    } else {
                        System.out.println("No Movement Required");
                    }

                    //Marks the end of requests
                    cameraAutomationRequestObserver.onCompleted();

                    //Pauses between requests
                    Thread.sleep(500);

                //Will catch any exceptions, display an error message to the user and the console, cancel the current request and reset the camera controls
                } catch (RuntimeException re) {
                    automatedCameraPosition.setText("Error: Resetting Automated Camera");
                    System.out.println(re.getMessage());
                    re.printStackTrace();
                    cancelRequest.cancel(null);
                } catch (InterruptedException ie) {
                    automatedCameraPosition.setText("Error: Resetting Automated Camera");
                    System.out.println(ie.getMessage());
                    ie.printStackTrace();
                    cancelRequest.cancel(null);
                } catch (Exception error) {
                    automatedCameraPosition.setText("Error: Resetting Automated Camera");
                    System.out.println(error.getMessage());
                    error.printStackTrace();
                    cancelRequest.cancel(null);
                }
            }
        });

        alarm1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Manual Alarm: Cell Block A");
                alarmActivatedAlarmTest.setText("Alarm Activated: ");
                emergencyLightsAlarmTest.setText("Emergency Lights: ");
                emergencySirensAlarmTest.setText("Emergency Sirens: ");
                ManagedChannel manualAlarmTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(manualAlarmTestChannel);
                ManualAlarmRequest manualAlarmRequest = ManualAlarmRequest.newBuilder().setAlarmID("alarm1").build();
                try {
                    ManualAlarmResponse manualAlarmResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).manualAlarm(manualAlarmRequest);
                    alarmActivatedAlarmTest.setText(alarmActivatedAlarmTest.getText() + manualAlarmResponse.getAlarmActivation());
                    emergencyLightsAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencyLighting());
                    emergencySirensAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencySirens());
                } catch (StatusRuntimeException sre) {
                    alarmActivatedAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencyLightsAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencySirensAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                manualAlarmTestChannel.shutdown();
                System.out.println("Manual Alarm Test Complete");
            }
        });

        alarm2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Manual Alarm: Cafeteria");
                alarmActivatedAlarmTest.setText("Alarm Activated: ");
                emergencyLightsAlarmTest.setText("Emergency Lights: ");
                emergencySirensAlarmTest.setText("Emergency Sirens: ");
                ManagedChannel manualAlarmTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(manualAlarmTestChannel);
                ManualAlarmRequest manualAlarmRequest = ManualAlarmRequest.newBuilder().setAlarmID("alarm2").build();
                try {
                    ManualAlarmResponse manualAlarmResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).manualAlarm(manualAlarmRequest);
                    alarmActivatedAlarmTest.setText(alarmActivatedAlarmTest.getText() + manualAlarmResponse.getAlarmActivation());
                    emergencyLightsAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencyLighting());
                    emergencySirensAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencySirens());
                } catch (StatusRuntimeException sre) {
                    alarmActivatedAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencyLightsAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencySirensAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                manualAlarmTestChannel.shutdown();
                System.out.println("Manual Alarm Test Complete");
            }
        });

        alarm3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Manual Alarm: Yard");
                alarmActivatedAlarmTest.setText("Alarm Activated: ");
                emergencyLightsAlarmTest.setText("Emergency Lights: ");
                emergencySirensAlarmTest.setText("Emergency Sirens: ");
                ManagedChannel manualAlarmTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(manualAlarmTestChannel);
                ManualAlarmRequest manualAlarmRequest = ManualAlarmRequest.newBuilder().setAlarmID("alarm3").build();
                try {
                    ManualAlarmResponse manualAlarmResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).manualAlarm(manualAlarmRequest);
                    alarmActivatedAlarmTest.setText(alarmActivatedAlarmTest.getText() + manualAlarmResponse.getAlarmActivation());
                    emergencyLightsAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencyLighting());
                    emergencySirensAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencySirens());
                } catch (StatusRuntimeException sre) {
                    alarmActivatedAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencyLightsAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencySirensAlarmTest.setText("Error: Alarm Failed. Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                manualAlarmTestChannel.shutdown();
                System.out.println("Manual Alarm Test Complete");
            }
        });

        securitySensorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Security Sensor");
                fireSuppressionFSTest.setText("Fire Suppression: ");
                emergencyLightsFSTest.setText("Emergency Lights: ");
                emergencySirensFSTest.setText("Emergency Sirens: ");
                ManagedChannel fireSensorTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(fireSensorTestChannel);
                FireSuppressionRequest fireSuppressionRequest = FireSuppressionRequest.newBuilder().setSensorID("securitySensor").build();
                try {
                    FireSuppressionResponse fireSuppressionResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).fireSuppression(fireSuppressionRequest);
                    fireSuppressionFSTest.setText(fireSuppressionFSTest.getText() + fireSuppressionResponse.getActivateFireSuppression());
                    emergencyLightsFSTest.setText(emergencyLightsFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                    emergencySirensFSTest.setText(emergencySirensFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                } catch (StatusRuntimeException sre) {
                    fireSuppressionFSTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencyLightsFSTest.setText("Error: Alarm Failed. Please Try Again");
                    emergencySirensFSTest.setText("Error: Alarm Failed. Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                fireSensorTestChannel.shutdown();
                System.out.println("Security Sensor Test Complete");
            }
        });

        fireSensorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Fire Sensor");
                fireSuppressionFSTest.setText("Fire Suppression: ");
                emergencyLightsFSTest.setText("Emergency Lights: ");
                emergencySirensFSTest.setText("Emergency Sirens: ");
                ManagedChannel fireSensorTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(fireSensorTestChannel);
                FireSuppressionRequest fireSuppressionRequest = FireSuppressionRequest.newBuilder().setSensorID("fireSensor").build();
                try {
                    FireSuppressionResponse fireSuppressionResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).fireSuppression(fireSuppressionRequest);
                    fireSuppressionFSTest.setText(fireSuppressionFSTest.getText() + fireSuppressionResponse.getActivateFireSuppression());
                    emergencyLightsFSTest.setText(emergencyLightsFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                    emergencySirensFSTest.setText(emergencySirensFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                } catch (StatusRuntimeException sre) {
                    fireSuppressionFSTest.setText("Error: Please Try Again");
                    emergencyLightsFSTest.setText("Error: Please Try Again");
                    emergencySirensFSTest.setText("Error: Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                fireSensorTestChannel.shutdown();
                System.out.println("Fire Sensor Test Complete");
            }
        });

        alarm4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nCalling Emergency Services");
                emergencyServicesCallTestStatus.setText("Emergency Services: ");
                ManagedChannel callEMSChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(callEMSChannel);
                AlarmController.Empty callEMSRequest = AlarmController.Empty.newBuilder().build();
                try {
                    EmergencyServicesCallResponse callEMSResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).emergencyServicesCall(callEMSRequest);
                    emergencyServicesCallTestStatus.setText(emergencyServicesCallTestStatus.getText() + callEMSResponse.getCallConfirmation());
                } catch (StatusRuntimeException sre) {
                    emergencyServicesCallTestStatus.setText("Error: Emergency Services Call Failed. Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                callEMSChannel.shutdown();
                System.out.println("Emergency Services Call Test Complete");
            }
        });

        alarmCheckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nChecking Alarms");
                alarmCheckInfo.setText("");
                alarmCheckInfo.setText("Checking Alarms\n");

                //Create a channel
                ManagedChannel checkAlarmsChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();

                //gRPC Blocking Stubs
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(checkAlarmsChannel);

                //Build the request, in this case it is empty
                AlarmController.Empty alarmCheckRequest = AlarmController.Empty.newBuilder().build();

                //Sets "withCancellation" equal to the context of the current scope that is independently cancellable
                cancelRequest = Context.current().withCancellation();

                try {
                    Iterator<AlarmCheckResponse> alarmCheckResponse = alarmControlsBlockingStub.withDeadlineAfter(DEADLINE, TimeUnit.SECONDS).alarmCheck(alarmCheckRequest);
                    while (alarmCheckResponse.hasNext()) {
                        AlarmCheckResponse temp = alarmCheckResponse.next();
                        alarmCheckInfo.setText(alarmCheckInfo.getText() + temp.getAlarmInfo() + "\n");
                    }

                } catch (StatusRuntimeException sre) {
                    alarmCheckInfo.setText("Error: Alarm Check Failed. Please Try Again");
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }

                //Shutdown the channel
                checkAlarmsChannel.shutdown();
                System.out.println("Alarm Check Complete");
            }
        });

        //Resets all the fields on the "Alarm Controls" tab
        alarmResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nResetting Fields");
                alarmActivatedAlarmTest.setText("Alarm Activated: ");
                emergencyLightsAlarmTest.setText("Emergency Lights: ");
                emergencySirensAlarmTest.setText("Emergency Sirens: ");
                fireSuppressionFSTest.setText("Fire Suppression: ");
                emergencyLightsFSTest.setText("Emergency Lights: ");
                emergencySirensFSTest.setText("Emergency Sirens: ");
                emergencyServicesCallTestStatus.setText("Emergency Services: ");
                alarmCheckInfo.setText("");
            }
        });
    }

    //jmDNS Discovery Methods

    //Retrieves the "service_type" from the service properties files
    private static String getServiceType(String fileName) {
        //Creates a variable for the "service_type"
        String serviceType = "";
        //Attempts to use the "FileInputStream" class to locate and retrieve data from the specified properties file
        try (InputStream input = Files.newInputStream(Paths.get("Smart Surveillance/src/main/resources/", fileName))) {
            //Creates an object of type "Properties" called "properties" and sets it equal to the retrieved properties files
            Properties properties = new Properties();
            properties.load(input);
            //Isolates the relevant data and stores it in "serviceType"
            serviceType = properties.getProperty("service_type");

        //Will catch any IO Exceptions such as "File Not Found"
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
        return serviceType;
    }

    //Attempts to discover the registered services
    //Copied from Sample Project - Smart Health & Calculator Project
    private void discoverJMDNSService(String serviceType, String nameOfService, String nameOfServiceInfo) {
        try {
            //Creates a "JmDNS" object called "jmdns" and sets it to the IP address of the local host
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            //Creates a "ServiceListener" to discover registered services
            jmdns.addServiceListener(serviceType, new ServiceListener() {
                @Override
                public void serviceAdded(ServiceEvent event) {
                    System.out.println(nameOfService + " has been added: " + event.getName() + "\n");
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println(nameOfService + " has been removed: " + event.getName() + "\n");
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    //Retrieves data from the "ServiceEvent" object and stores it in a "ServiceInfo" object called "serviceInfo"
                    ServiceInfo serviceInfo = event.getInfo();

                    //Sets "serviceInfo" equal to the name of the service we are trying to discover
                    if (nameOfServiceInfo == "doorControllerService1Info") {
                        doorControllerService1Info = serviceInfo;
                    } else if (nameOfServiceInfo == "cameraControllerService2Info") {
                        cameraControllerService2Info = serviceInfo;
                    } else if (nameOfServiceInfo == "alarmControllerService3Info") {
                        alarmControllerService3Info = serviceInfo;
                    }

                    //Prints out the data received from the registered service
                    System.out.println("Resolving Service: " + nameOfService +
                    "\nType: " + event.getType() +
                    "\nName: " + event.getName() +
                    "\nDescription: " + serviceInfo.getNiceTextString() +
                    "\nHost: " + serviceInfo.getHostAddresses()[0] +
                    "\nPort: " + serviceInfo.getPort()
                    );

                    System.out.println("\n" + nameOfService + " has been resolved: " + event.getName() + "\n");
                }
            });
            //Waits for a specifed amount of time and then closes the stream
            Thread.sleep(500);
            jmdns.close();
        }
        //Catches any errors and prints their details to the console
        catch (UnknownHostException uhe) {
            System.out.println(uhe.getMessage());
            uhe.printStackTrace();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
            ie.printStackTrace();
        }
    }

    //Calls the "discoverJMDNSService() method on all registered services
    private void discoverJMDNSServices() {
        System.out.println("Discovering Registered Services\n");
        discoverJMDNSService(getServiceType("Service1.properties"), "Door Controller", "doorControllerService1Info");
        discoverJMDNSService(getServiceType("Service2.properties"), "Camera Controller", "cameraControllerService2Info");
        discoverJMDNSService(getServiceType("Service3.properties"), "Alarm Controller", "alarmControllerService3Info");
    }

    public static void main(String[] args) {
        //Creates a "SecurityGUI" object called "securityGUI"
        SecurityGUI securityGUI = new SecurityGUI();

    }

    private void createUIComponents() {
        String imageName = "Camera1.jpg";
        String imageName2 = "Camera2.jpg";
        class ImagePanel extends JPanel {
            BufferedImage image;
            ImagePanel(String imageName) {
                try {
                    image = ImageIO.read(new File("D:\\Documents\\College\\Software Development\\Distributed Systems\\CA\\CA Code\\Smart Surveillance\\Images\\" + imageName));
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                    ioe.printStackTrace();
                }
            }
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, this);
            }
        }
        cameraScreenJPanel = new ImagePanel(imageName);
        cameraScreenJPanel2 = new ImagePanel(imageName2);
        cameraScreenJPanel2.setVisible(false);
    }
}