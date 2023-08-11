package CameraController;

import CameraController.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Service2Server extends Service2ImplBase {
    //Server Methods

    //Creates a private method called "getProperties" that returns "Properties"
    //Reads the data from the properties file using "InputStream" and prints them to the console
    private Properties getProperties(String fileName) {
        Properties properties = null; //Empty "Properties" object called "properties"

        //Attempts to read data from the properties file using an "InputStream" called "input"
        try (InputStream input = Files.newInputStream(Paths.get("Smart Surveillance/src/main/resources/", fileName))) {
            properties = new Properties(); //Makes "properties" equal to an empty property list
            properties.load(input); //Loads the properties files from "input"
            //Prints the data from the properties file
            System.out.println("\n---- " + properties.getProperty("service_name") + " Properties ----");
            System.out.println("Service Type: " + properties.getProperty("service_type"));
            System.out.println("Service Name: " + properties.getProperty("service_name"));
            System.out.println("Service Description: " + properties.getProperty("service_desc"));
            System.out.println("Service Port: " + properties.getProperty("service_port"));

            //Catches any IO Exceptions and prints them to the console
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
        return properties;
    }

    //Creates a private method to register the jmDNS service
    //Takes in the data from the properties file stored in "properties and uses it to register the jmDNS service
    private void registerService(Properties properties) {
        //Attempts to register the jmDNS service
        try {
            //Creates a "JmDNS" object called "jmdns" and sets it to the IP address of the local host
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            //Stores the data from the properties file in appropriate variables
            String service_type = properties.getProperty("service_type");
            String service_name = properties.getProperty("service_name");
            int service_port = Integer.parseInt(properties.getProperty("service_port"));
            String service_desc = properties.getProperty("service_desc");

            //Creates a "ServiceInfo" object called "serviceInfo" and sets it equal to a new service created with the data from the properties file
            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_desc);
            jmdns.registerService(serviceInfo);

            //Prints a message to the console with the details of the service being registered
            System.out.println("\nRegistering Service:\nService Type: " + service_type + "\nService Name: " + service_name + "\nService Description: " + service_desc + "\nService Port: " + service_port);

            //Pause instruction
            Thread.sleep(500);

            //Catches any IO or Interrupted Exceptions and prints them to the console
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //Remote Methods
    public void cameraAdjustment(CameraAdjustmentRequest cameraAdjustmentRequest, StreamObserver<CameraAdjustmentResponse> cameraAdjustmentResponseObserver) {
        System.out.println("\nCamera Adjustment: Receiving Info: " + "Camera ID: " + cameraAdjustmentRequest.getCameraID() + ", Current Position: " + cameraAdjustmentRequest.getCameraPosition() + ", Direction: " + cameraAdjustmentRequest.getCameraDirection());
        //Preparing the request
        //Converting the camera position in to x and y positions
        String stringX = cameraAdjustmentRequest.getCameraPosition().substring(1);
        String stringY = cameraAdjustmentRequest.getCameraPosition().substring(0, 1);
        int cameraX = Integer.parseInt(stringX) - 1;
        int cameraY = 0;
        switch (stringY) {
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
        String responseMessage = "";

        //Moving the camera in the chosen direction
        switch (cameraAdjustmentRequest.getCameraDirection()) {
            case UP:
                if (cameraY > 0 && cameraY <= 2) {
                    cameraY--;
                    System.out.println("Camera Adjustment: Moving Camera Left");
                }
                break;
            case DOWN:
                if (cameraY >= 0 && cameraY < 2) {
                    cameraY++;
                    System.out.println("Camera Adjustment: Moving Camera Right");
                }
                break;
            case RIGHT:
                if (cameraX >= 0 && cameraX < 2) {
                    cameraX++;
                    System.out.println("Camera Adjustment: Moving Camera Up");
                }
                break;
            case LEFT:
                if (cameraX > 0 && cameraX <= 2) {
                    cameraX--;
                    System.out.println("Camera Adjustment: Moving Camera Down");
                }
                break;
        }

        //Converting the camera's x and y positions back into their original format and adding it to "responseMessage
        switch (cameraY) {
            case 0:
                responseMessage = "A";
                break;
            case 1:
                responseMessage = "B";
                break;
            case 2:
                responseMessage = "C";
                break;
        }
        responseMessage += Integer.toString(cameraX + 1);
        CameraAdjustmentResponse cameraAdjustmentResponse = CameraAdjustmentResponse.newBuilder().setCameraPosition(responseMessage).build();
        cameraAdjustmentResponseObserver.onNext(cameraAdjustmentResponse);
        cameraAdjustmentResponseObserver.onCompleted();
        System.out.println("Camera Adjustment: Completed");
    }

    public void motionDetected(Empty motionDetectedRequest, StreamObserver<MotionDetectedResponse> motionDetectedResponseObserver) {
        System.out.println("\nMotion Detected: Processing");
        String responseMessage = "Activated";
        MotionDetectedResponse motionDetectedResponse = MotionDetectedResponse.newBuilder().setDetectionAlert(responseMessage).build();
        motionDetectedResponseObserver.onNext(motionDetectedResponse);
        motionDetectedResponseObserver.onCompleted();
        System.out.println("Motion Detected: Message Sent");
    }

    public StreamObserver<CameraAutomationRequest> cameraAutomation(StreamObserver<CameraAutomationResponse> cameraAutomationResponseObserver) {
        return new StreamObserver<CameraAutomationRequest>() {
            @Override
            public void onNext(CameraAutomationRequest automationRequest) {
                System.out.println("\nMotion Detected: Moving " + automationRequest.getAutomatedCameraID() + " to " + automationRequest.getLocationOfMovement());
                System.out.println("Automated Camera Position: " + automationRequest.getCameraPosition());

                //Variable to store response & flag to track camera movement
                String responseMessage = "";
                boolean cameraMoved = false;
                //Converting into x and y positions
                String locX, locY;
                String camX, camY;
                int cameraX, locationX;
                int cameraY = 0;
                int locationY = 0;
                locX = automationRequest.getLocationOfMovement().substring(1);
                locY = automationRequest.getLocationOfMovement().substring(0, 1);
                camX = automationRequest.getCameraPosition().substring(1);
                camY = automationRequest.getCameraPosition().substring(0, 1);
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

                //Move camera towards location of movement one section at a time
                if (cameraX < locationX) {
                    cameraX++;
                    cameraMoved = true;
                } else if (cameraX > locationX){
                    cameraX--;
                    cameraMoved = true;
                }
                while (cameraMoved = false) {
                    if (cameraY < locationY) {
                        cameraY++;
                    } else if (cameraY > locationY) {
                        cameraY--;
                    }
                }

                //Converting the camera's x and y positions back into their original format and storing them in "responseMessage"
                switch (cameraY) {
                    case 0:
                        responseMessage = "A";
                        break;
                    case 1:
                        responseMessage = "B";
                        break;
                    case 2:
                        responseMessage = "C";
                        break;
                }
                responseMessage += Integer.toString(cameraX + 1);

                //Preparing response
                CameraAutomationResponse automationResponse = CameraAutomationResponse.newBuilder().setCameraAutomation(responseMessage).build();

                //Sending response
                cameraAutomationResponseObserver.onNext(automationResponse);
            }

            //Catches errors and prints them to the console
            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
                throwable.printStackTrace();
            }

            //Runs when the response is completed
            @Override
            public void onCompleted() {
                cameraAutomationResponseObserver.onCompleted();
                System.out.println("Motion Detected: Camera arrived at location of movement");
            }
        };
    }

    public static void main(String[] args) {
        //Creates a new "Service2Server" object called "service2Server"
        Service2Server service2Server = new Service2Server();
        String propertiesFileName = "Service2.properties";
        //Creates a new "Properties" object
        Properties properties = service2Server.getProperties(propertiesFileName);
        service2Server.registerService(properties);
        int port = Integer.parseInt(properties.getProperty("service_port"));

        try {
            //Creates a "Server" object called "server1" and uses the "ServerBuilder" class to build and start a new server for the designated port and service registered to "service1Server"
            Server server2 = ServerBuilder.forPort(port).addService(service2Server).build().start();
            //Prints the new server's info to the console
            System.out.println("\nServer 2 Started: Camera Controller. Listening on Port " + port);

            //Waits for the server to terminate
            server2.awaitTermination();

            //Catches any IO or Interrupted Exceptions and prints them to the console
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
