package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //publisher ->subject
        // subscriber -> observer ->different types ->super class ->
        //types of observer -> NewsReader,FoodWrapper

        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type1Observer();
        Observer observer3 = new Type2Observer();

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

       // subject.start();

        subject.notifyObservers("Curfew will be imposed today ");

        Thread.sleep(10000);
        System.out.println("======================");

        subject.notifyObservers("Reverse ");

        Thread.sleep(5000);

        subject.unsubscribe(observer2);
        Thread.sleep(5000);
        System.out.println("============================================");

        subject.notifyObservers("Fuel prices gone up !");

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
