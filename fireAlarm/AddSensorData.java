package com.company.fireAlarm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSensorData extends JFrame{
    private JPanel main;
    private JTextField textState;
    private JButton btnChange;

    public AddSensorData(String title)  {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(main);
        this.pack();

//
//        btnChange.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Users.state= Double.parseDouble(textState.getText());
////                homePage.lblTxtValue.setText(Double.toString(Users.state));
//            }
//        });
    }



}
