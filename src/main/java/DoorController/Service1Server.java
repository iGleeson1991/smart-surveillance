package DoorController;

import DoorController.Service1Grpc.Service1ImplBase;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class Service1Server extends Service1ImplBase {
    //Server Variables
    private final ArrayList<String> door1Badges = new ArrayList<>(Arrays.asList("badge1", "badge3"));
    private final ArrayList<String> door2Badges = new ArrayList<>(Arrays.asList("badge2", "badge4"));
    private final ArrayList<String> door1Codes = new ArrayList<>(Arrays.asList("1234", "4321"));
    private final ArrayList<String> door2Codes = new ArrayList<>(Arrays.asList("9999", "1111"));

    //Server Methods

    //Creates a private method called "getProperties" that returns "Properties"
    //Reads the data from the properties file using "InputStream" and prints them to the console
    private Properties getProperties(String fileName) {
        Properties properties = null; //Empty "Properties" object called "properties"

        //Attempts to read data from the properties file using an "InputStream" called "input"
        try (InputStream input = Files.newInputStream(Paths.get("Smart Surveillance/src/main/resources/",fileName))){
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

    public void scanSecurityBadge(ScanSecurityBadgeRequest badgeRequest, StreamObserver<ScanSecurityBadgeResponse> badgeResponseObserver) {
        //badgeRequest should contain the doorID and badgeID
        System.out.println("\nSecurity Badge Scanned: Receiving Info: " + badgeRequest);
        //Variable to store our response message
        String responseMessage = "";
        //Assumes that there are only two doors
        if (badgeRequest.getDoorID() == "door1") {
            if (door1Badges.contains(badgeRequest.getBadgeID())) {
                responseMessage = "Access Granted";
            } else {
                responseMessage = "Access Denied";
            }
        } else {
            if (door2Badges.contains(badgeRequest.getBadgeID())) {
                responseMessage = "Access Granted";
            } else {
                responseMessage = "Access Denied";
            }
        }
        System.out.println("Security Badge Scanned: " + responseMessage);

        //Creates a "ScanSecurityBadgeResponse" object and attaches "responseMessage" to it.
        ScanSecurityBadgeResponse badgeResponse = ScanSecurityBadgeResponse.newBuilder().setValid(responseMessage).build();

        badgeResponseObserver.onNext(badgeResponse);
        badgeResponseObserver.onCompleted();

        System.out.println("Security Badge Scanned: Completed\n");
    }

    public void securityCodeEntry(SecurityCodeEntryRequest codeEntryRequest, StreamObserver<SecurityCodeEntryResponse> codeEntryResponseObserver) {
        //codeEntryRequest should contain the doorID and securityCode
        System.out.println("\nSecurity Code Entered: Receiving Info: " + codeEntryRequest);
        String responseMessage = "";
        //Assumes that there are only two doors
        if (codeEntryRequest.getDoorID() == "door1") {
            if (door1Codes.contains(codeEntryRequest.getSecurityCode())) {
                responseMessage = "Access Granted";
            } else {
                responseMessage = "Access Denied";
            }
        } else {
            if (door2Codes.contains(codeEntryRequest.getSecurityCode())) {
                responseMessage = "Access Granted";
            } else {
                responseMessage = "Access Denied";
            }
        }
        System.out.println("Security Code Entered: " + responseMessage);

        SecurityCodeEntryResponse codeEntryResponse = SecurityCodeEntryResponse.newBuilder().setValid(responseMessage).build();

        codeEntryResponseObserver.onNext(codeEntryResponse);
        codeEntryResponseObserver.onCompleted();

        System.out.println("Security Code Entered: Completed\n");
    }

    public void intercomCall(Empty callRequest, StreamObserver<IntercomCallResponse> callResponseObserver) {
        System.out.println("\nIntercom Call: Requesting Call");
        String responseMessage = "Calling...";

        System.out.println("Intercom Call: " + responseMessage);

        IntercomCallResponse callResponse = IntercomCallResponse.newBuilder().setCallResponse(responseMessage).build();

        callResponseObserver.onNext(callResponse);
        callResponseObserver.onCompleted();

        System.out.println("Intercom Call: Completed\n");
    }

    public void intercomAnswer(IntercomAnswerRequest answerRequest, StreamObserver<IntercomAnswerResponse> answerResponseObserver) {
        System.out.println("\nIntercom Answer: Receiving Info: " + answerRequest);
        String responseMessage = "Call Timed Out";
        if (answerRequest.getAnswerRequest() == "answer") {
            responseMessage = "Call Answered";
        } else if (answerRequest.getAnswerRequest() == "reject") {
            responseMessage = "Call Rejected";
        }

        System.out.println("Intercom Answer: " + responseMessage);

        IntercomAnswerResponse answerResponse = IntercomAnswerResponse.newBuilder().setAnswerResponse(responseMessage).build();

        answerResponseObserver.onNext(answerResponse);
        answerResponseObserver.onCompleted();

        System.out.println("Intercom Answer: Completed\n");
    }

    public StreamObserver<OneWayCommunicationRequest> oneWayCommunication(StreamObserver<OneWayCommunicationResponse> oneWayResponseObserver) {
        //Returns a new "StreamObserver" object of type "OneWayCommunicationRequest".
        return new StreamObserver<OneWayCommunicationRequest>() {
            String responseMessage = "";
            @Override
            public void onNext(OneWayCommunicationRequest oneWayRequest) {
                System.out.println("\nOne Way Communication: Receiving Info: " + oneWayRequest);

                if(oneWayRequest.getButtonHeld() == true) {
                    responseMessage = "Communications Channel Open";
                } else {
                    responseMessage = "Communications Channel Closed";
                }
            }

            //Method will print any errors caught to the console.
            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                OneWayCommunicationResponse oneWayResponse = OneWayCommunicationResponse.newBuilder().setChannelStatus(responseMessage).build();
                oneWayResponseObserver.onNext(oneWayResponse);
                oneWayResponseObserver.onCompleted();
                System.out.println("One Way Communication: Completed\n");
            }
        };
    }

    public static void main(String[] args) {
        //Creates a new "Service1Server" object called "service1Server"
        Service1Server service1Server = new Service1Server();
        String propertiesFileName = "Service1.properties";
        //Creates a new "Properties" object
        Properties properties = service1Server.getProperties(propertiesFileName);
        service1Server.registerService(properties);
        int port = Integer.parseInt(properties.getProperty("service_port"));

        try {
            //Creates a "Server" object called "server1" and uses the "ServerBuilder" class to build and start a new server for the designated port and service registered to "service1Server"
            Server server1 = ServerBuilder.forPort(port).addService(service1Server).build().start();
            //Prints the new server's info to the console
            System.out.println("\nServer 1 Started: Door Controller. Listening on Port " + port);

            //Waits for the server to terminate
            server1.awaitTermination();

            //Catches any IO or Interrupted Exceptions and prints them to the console
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

