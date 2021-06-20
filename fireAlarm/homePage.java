package com.company.fireAlarm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homePage extends JFrame {
    private JButton addResidentsButton;
    private JPanel panel1;
    private JButton addSensorValueButton;
    private JLabel lblStatusName;
    private JLabel lblTxtValue;

    public homePage(String title) throws InterruptedException {
        super(title);
        this.lblTxtValue.setText(Double.toString(Users.state));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        addSensorValueButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new AddSensorData("Add Sensor Data");
                frame.setVisible(true);
            }
            });
//
//        while (true){
//             this.lblTxtValue.setText(Double.toString(Users.state));
//             Thread.sleep(1000);
        addResidentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new AddResidents("Add Sensor Data");
                frame.setVisible(true);
            }
        });
    }


//    }
//

}
