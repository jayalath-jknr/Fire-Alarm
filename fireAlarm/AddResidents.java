package com.company.fireAlarm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddResidents extends JFrame{
    private JLabel lblName;
    private JTextField textName;
    private JLabel lblEmail;
    private JTextField textEmail;
    private JButton btnSubmit;
    private JPanel panelResidents;

    public AddResidents(String title)  {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelResidents);
        this.pack();

////
//        btnChange.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Users.state= Double.parseDouble(textState.getText());
////                homePage.lblTxtValue.setText(Double.toString(Users.state));
//            }
//        });
//        btnSubmit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = textName.getText();
//                String email = textEmail.getText();
//                Users user = new Resident();
//                user.userName = name;
//            }
//        });
    }
}
