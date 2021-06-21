package com.company.fireAlarm;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //publisher ->subject
        // subscriber -> observer ->different types ->super class ->
        //types of observer -> NewsReader,FoodWrapper

        JFrame frame = new homePage("Home Page");
        frame.setVisible(true);
//        while (frame == true){
//             this.lblTxtValue.setText(Double.toString(Users.state));
//             Thread.sleep(1000);
//        }



        Users users1 = new Resident();
        Users users2 = new Resident();
        Users users3 = new HomeOwner();

        SmokeSensorState smokeSensor = new SmokeSensorState();
        smokeSensor.subscribe(users1);
        smokeSensor.subscribe(users2);
        smokeSensor.subscribe(users3);

       // subject.start();
        smokeSensor.Start();

//        smokeSensor.notifyObservers("Curfew will be imposed today ",Users.state);
//
//        Thread.sleep(200);
//        System.out.println("======================");
//
//        smokeSensor.notifyObservers("Reverse ",Users.state);
//
//        Thread.sleep(5000);
//
//        smokeSensor.unsubscribe(users2);
//        Thread.sleep(5000);
//        System.out.println("============================================");
//
//        smokeSensor.notifyObservers("Fuel prices gone up !",Users.state);

        smokeSensor.stop();
        // create folder news
        //if (news) creat text file and copy text file into news folder
        //subject class keep watching news folder file watcher class
        //if (news) notify with news content
        //keep watching for news
        //create gui
        //create form to enter name and email address
        //and submit -> add him to observer list


    }

}
