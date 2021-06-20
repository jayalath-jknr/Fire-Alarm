package com.company.fireAlarm;

public class Resident implements Users {


    static Double state;

    String userName;
    String email;
//
//    @Override
//    public void notifyObserver(String news) {
//        System.out.println("Reading the news paper  : "+ news+" :"+state);
//    }

    @Override
    public void notifyObserver(String news, Double state) {
        System.out.println("Reading the news paper  : "+ news+" :"+state);
    }



    //accept email address
    //private String email

//    @Override
//    public void notifyObserver(String news) {
//        //send an actual email
//        System.out.println("Reading the news paper  : "+ news);
//    }
}
