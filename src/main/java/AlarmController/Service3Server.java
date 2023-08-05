package AlarmController;

import AlarmController.Service3Grpc.Service3ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Service3Server extends Service3ImplBase {
    public static void main(String[] args) {
        //Creates a new "Service3Server" object called "service3Server"
        Service3Server service3Server = new Service3Server();
        String propertiesFileName = "Service3.properties";
        //Creates a new "Properties" object
        Properties properties = service3Server.getProperties(propertiesFileName);
        service3Server.registerService(properties);
        int port = Integer.parseInt(properties.getProperty("service_port"));

        try {
            //Creates a "Server" object called "server1" and uses the "ServerBuilder" class to build and start a new server for the designated port and service registered to "service1Server"
            Server server3 = ServerBuilder.forPort(port).addService(service3Server).build().start();
            //Prints the new server's info to the console
            System.out.println("Server 3 Started: Door Controller. Listening on Port " + port);

            //Waits for the server to terminate
            server3.awaitTermination();

            //Catches any IO or Interrupted Exceptions and prints them to the console
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //Private Server Methods

    //Creates a private method called "getProperties" that returns "Properties"
    //Reads the data from the properties file using "InputStream" and prints them to the console
    private Properties getProperties(String fileName) {
        Properties properties = null; //Empty "Properties" object called "properties"

        //Attempts to read data from the properties file using an "InputStream" called "input"
        try (InputStream input = Files.newInputStream(Paths.get("Smart Surveillance/src/main/resources/",fileName))){
            properties = new Properties(); //Makes "properties" equal to an empty property list
            properties.load(input); //Loads the properties files from "input"
            //Prints the data from the properties file
            System.out.println("---- " + properties.getProperty("service_name") + " Properties ----");
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
            System.out.println("Registering Service:\nService Type: " + service_type + "\nService Name: " + service_name + "\nService Description: " + service_desc + "\nService Port: " + service_port);

            //Pause instruction
            Thread.sleep(500);

            //Catches any IO or Interrupted Exceptions and prints them to the console
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //Remote Methods
    // TODO: 04/08/2023 Finish remote methods

    public void manualAlarm() {

    }

    public void fireSuppression() {

    }

    public void emergencyServicesCall() {

    }
}
