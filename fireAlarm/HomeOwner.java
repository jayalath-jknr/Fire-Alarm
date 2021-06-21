package com.company.fireAlarm;

public class HomeOwner implements Users {

    static Double state;

    String userName;
    String email;

    @Override
    public void notifyObserver(String news, Double state) {
        System.out.println("Contact fire brigade  :"+ news+" :"+state);
    }

//    private String email;
//    private Integer TelNo;

//    @Override
//    public void notifyObserver(String news) {
//
//        System.out.println("Wrap the foods using the news paper  :"+  news);
//    }
}
