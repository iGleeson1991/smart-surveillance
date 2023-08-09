package GUI;

import AlarmController.*;
import CameraController.Service2Grpc;
import DoorController.Service1Grpc;
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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SecurityGUI extends JFrame {
    //Service Variables

    //A ten-second deadline for server responses. Requests will terminate after 10 seconds
    //Copied from Sample Project - Smart Health
    private int deadline = 10;

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

    //Intercom Controls Tab
    private JPanel intercomControlsJPanel, userCallJPanel, securityResponseJPanel, intercomJPanel;
    private JButton callSecurityButton, answerButton, rejectButton, intercomButton;
    private JTextField callSecurityStatus, intercomStatus;

    //Camera Controls Tab
    private JPanel cameraControllerJPanel, cameraSelectJPanel, directionControlsJPanel, motionDetectorJPanel;
    private JRadioButton camera1RadioButton, camera2RadioButton;
    private JButton upButton, leftButton, rightButton, downButton, motionLocationSubmitButton;
    private JTextField cameraPosition, inputDetectedMotionLocation, motionDetectedStatus, motionLocationStatus;

    //Camera Screen
    private JPanel cameraScreenJPanel;

    //Alarm Controls Tab
    private JPanel manualAlarmJPanel, fireSuppressionJPanel, emergencyServicesCallJPanel, alarmButtonsJPanel, alarmResponseJPanel, sensorButtonsJPanel, sensorResponseJPanel, escButtonJPanel, escResponseJPanel, alarmCheckJPanel, alarmCheckButtonJPanel;
    private JButton alarm1Button, alarm2Button, alarm3Button, securitySensorButton, fireSensorButton, alarm4Button, alarmCheckButton;
    private JTextField alarmActivatedAlarmTest, emergencyLightsAlarmTest, emergencySirensAlarmTest, emergencyLightsFSTest, emergencySirensFSTest, fireSuppressionFSTest, emergencyServicesCallTestStatus;
    private JTextArea alarmCheckInfo;

    public SecurityGUI() {
        //Discovers all registered services
        discoverJMDNSServices();

        System.out.println("\nLaunching Security GUI");

        //Creates GUI
        setContentPane(securityControllerGUI);
        setTitle("Security GUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1280, 800);
        setLocationRelativeTo(null);
        setVisible(true);

        door1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        door2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        sBadge1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        sBadge2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        sBadge3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        sBadge4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        doorCodeSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        callSecurityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        rejectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        intercomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        camera1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        camera2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish

            }
        });
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        motionLocationSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Finish
            }
        });
        alarm1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Manual Alarm");
                ManagedChannel manualAlarmTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(manualAlarmTestChannel);
                ManualAlarmRequest manualAlarmRequest = ManualAlarmRequest.newBuilder().setAlarmID("alarm1").build();
                try {
                    ManualAlarmResponse manualAlarmResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).manualAlarm(manualAlarmRequest);
                    alarmActivatedAlarmTest.setText(alarmActivatedAlarmTest.getText() + manualAlarmResponse.getAlarmActivation());
                    emergencyLightsAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencyLighting());
                    emergencySirensAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencySirens());
                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                manualAlarmTestChannel.shutdown();
                System.out.println("\nManual Alarm Test Complete");
            }
        });
        alarm2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Manual Alarm");
                ManagedChannel manualAlarmTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(manualAlarmTestChannel);
                ManualAlarmRequest manualAlarmRequest = ManualAlarmRequest.newBuilder().setAlarmID("alarm2").build();
                try {
                    ManualAlarmResponse manualAlarmResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).manualAlarm(manualAlarmRequest);
                    alarmActivatedAlarmTest.setText(alarmActivatedAlarmTest.getText() + manualAlarmResponse.getAlarmActivation());
                    emergencyLightsAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencyLighting());
                    emergencySirensAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencySirens());
                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                manualAlarmTestChannel.shutdown();
                System.out.println("\nManual Alarm Test Complete");
            }
        });
        alarm3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Manual Alarm");
                ManagedChannel manualAlarmTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(manualAlarmTestChannel);
                ManualAlarmRequest manualAlarmRequest = ManualAlarmRequest.newBuilder().setAlarmID("alarm3").build();
                try {
                    ManualAlarmResponse manualAlarmResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).manualAlarm(manualAlarmRequest);
                    alarmActivatedAlarmTest.setText(alarmActivatedAlarmTest.getText() + manualAlarmResponse.getAlarmActivation());
                    emergencyLightsAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencyLighting());
                    emergencySirensAlarmTest.setText(emergencyLightsAlarmTest.getText() + manualAlarmResponse.getActivateEmergencySirens());
                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                manualAlarmTestChannel.shutdown();
                System.out.println("\nManual Alarm Test Complete");
            }
        });
        securitySensorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Security Sensor");
                ManagedChannel fireSensorTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(fireSensorTestChannel);
                FireSuppressionRequest fireSuppressionRequest = FireSuppressionRequest.newBuilder().setSensorID("securitySensor").build();
                try {
                    FireSuppressionResponse fireSuppressionResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).fireSuppression(fireSuppressionRequest);
                    fireSuppressionFSTest.setText(fireSuppressionFSTest.getText() + fireSuppressionResponse.getActivateFireSuppression());
                    emergencyLightsFSTest.setText(emergencyLightsFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                    emergencySirensFSTest.setText(emergencySirensFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                fireSensorTestChannel.shutdown();
                System.out.println("\nSecurity Sensor Test Complete");
            }
        });
        fireSensorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nTesting Fire Sensor");
                ManagedChannel fireSensorTestChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(fireSensorTestChannel);
                FireSuppressionRequest fireSuppressionRequest = FireSuppressionRequest.newBuilder().setSensorID("fireSensor").build();
                try {
                    FireSuppressionResponse fireSuppressionResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).fireSuppression(fireSuppressionRequest);
                    fireSuppressionFSTest.setText(fireSuppressionFSTest.getText() + fireSuppressionResponse.getActivateFireSuppression());
                    emergencyLightsFSTest.setText(emergencyLightsFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                    emergencySirensFSTest.setText(emergencySirensFSTest.getText() + fireSuppressionResponse.getActivateEmergencyLighting());
                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                fireSensorTestChannel.shutdown();
                System.out.println("\nFire Sensor Test Complete");
            }
        });
        alarm4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nCalling Emergency Services");
                ManagedChannel callEMSChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(callEMSChannel);
                Empty callEMSRequest = Empty.newBuilder().build();
                try {
                    EmergencyServicesCallResponse callEMSResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).emergencyServicesCall(callEMSRequest);
                    emergencyServicesCallTestStatus.setText(emergencyServicesCallTestStatus.getText() + callEMSResponse.getCallConfirmation());
                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }
                callEMSChannel.shutdown();
                System.out.println("\nEmergency Services Call Test Complete");
            }
        });
        alarmCheckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\nChecking Alarms");
                alarmCheckInfo.setText("Checking Alarms\n");

                /* Testing Instructions - jmDNS Services would never resolve on my system
                try {
                    System.out.println(InetAddress.getLocalHost());
                } catch (UnknownHostException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println(alarmControllerService3Info.getHostAddresses());
                System.out.println(alarmControllerService3Info.getPort());
                 */

                //Create a channel
                ManagedChannel checkAlarmsChannel = ManagedChannelBuilder.forAddress(alarmControllerService3Info.getHostAddresses()[0], alarmControllerService3Info.getPort()).usePlaintext().build();

                //gRPC Blocking Stubs
                Service3Grpc.Service3BlockingStub alarmControlsBlockingStub = Service3Grpc.newBlockingStub(checkAlarmsChannel);

                //Build the request, in this case it is empty
                Empty alarmCheckRequest = Empty.newBuilder().build();

                //Sets "withCancellation" equal to the context of the current scope that is independently cancellable
                cancelRequest = Context.current().withCancellation();

                try {
                    Iterator<AlarmCheckResponse> alarmCheckResponse = alarmControlsBlockingStub.withDeadlineAfter(deadline, TimeUnit.SECONDS).alarmCheck(alarmCheckRequest);
                    while (alarmCheckResponse.hasNext()) {
                        AlarmCheckResponse temp = alarmCheckResponse.next();
                        alarmCheckInfo.setText(alarmCheckInfo.getText() + temp.getAlarmInfo() + "\n");
                    }

                } catch (StatusRuntimeException sre) {
                    sre.getMessage();
                    sre.printStackTrace();
                    cancelRequest.cancel(sre.getCause());
                }

                //Shutdown the channel
                checkAlarmsChannel.shutdown();
                System.out.println("\nAlarm Check Complete");
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
                    System.out.println(nameOfService + " has been added: " + event.getInfo());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println(nameOfService + " has been removed: " + event.getInfo());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println(nameOfService + " has been resolved: " + event.getInfo());

                    //Retrieves data from the "ServiceEvent" object and stores it in a "ServiceInfo" object called "serviceInfo"
                    ServiceInfo serviceInfo = event.getInfo();
                    System.out.println(serviceInfo);

                    //Sets "serviceInfo" equal to the name of the service we are trying to discover
                    if (nameOfServiceInfo == "doorControllerService1Info") {
                        doorControllerService1Info = serviceInfo;
                    } else if (nameOfServiceInfo == "cameraControllerService2Info") {
                        cameraControllerService2Info = serviceInfo;
                    } else if (nameOfServiceInfo == "alarmControllerService3Info") {
                        alarmControllerService3Info = serviceInfo;
                    }

                    //Prints out the data received from the registered service
                    System.out.println("Resolving Service: " + serviceType +
                    "\nType: " + event.getType() +
                    "\nName: " + event.getName() +
                    "\nDescription: " + serviceInfo.getNiceTextString() +
                    "\nHost: " + serviceInfo.getHostAddresses()[0] +
                    "\nPort: " + serviceInfo.getPort()
                    );
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
        String imageName = "Camera1B2.jpg";
        class ImagePanel extends JPanel {
            BufferedImage image;
            ImagePanel(String imageName) {
                try {
                    image = ImageIO.read(new File("D:\\Documents\\College\\Software Development\\Distributed Systems\\CA\\CA Code\\Smart Surveillance\\" + imageName));
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
    }
}
