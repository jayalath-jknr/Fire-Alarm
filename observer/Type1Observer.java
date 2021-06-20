package com.company.observer;

public class Type1Observer implements Observer{

    //accept email address
    //private String email
    @Override
    public void notifyObserver(String news) {
        //send an actual email
        System.out.println("Reading the news paper  : "+ news);
    }
}
