package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecurityGUI extends JFrame {
    public static void main(String[] args) {
        new SecurityGUI();
    }

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
    private JTextField cameraPosition, inputDetectedMotionLocation, motionDetectedStatus;

    //Camera Screen
    private JPanel cameraScreenJPanel;

    private JLayeredPane visualCameraPosition;

    //Alarm Controls Tab
    private JPanel manualAlarmJPanel, fireSuppressionJPanel, emergencyServicesCallJPanel, alarmButtonsJPanel, alarmResponseJPanel, sensorButtonsJPanel, sensorResponseJPanel, escButtonJPanel, escResponseJPanel;
    private JButton alarm1Button, alarm2Button, alarm3Button, securitySensorButton, fireSensorButton, alarm4Button;
    private JTextField alarmActivatedAlarmTest, emergencyLightsAlarmTest, emergencySirensAlarmTest, emergencyLightsFSTest, emergencySirensFSTest, fireSuppressionFSTest, emergencyServicesCallTestStatus;

    public SecurityGUI() {
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
    }
}
