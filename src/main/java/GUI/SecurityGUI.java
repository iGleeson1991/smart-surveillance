package GUI;

import io.grpc.Context;
import io.grpc.Context.CancellableContext;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

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

    private JLayeredPane visualCameraPosition;

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

            }
        });
        door2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sBadge1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sBadge2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sBadge3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        sBadge4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        doorCodeSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        callSecurityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        answerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rejectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        intercomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        camera1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        camera2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        motionLocationSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alarm1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alarm2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alarm3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        securitySensorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fireSensorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alarm4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alarmCheckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
                    System.out.println(nameOfService + " has been added: " + event.getName());
                }

                @Override
                public void serviceRemoved(ServiceEvent event) {
                    System.out.println(nameOfService + " has been removed: " + event.getName());
                }

                @Override
                public void serviceResolved(ServiceEvent event) {
                    System.out.println(nameOfService + " has been resolved: " + event.getName());

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
}
