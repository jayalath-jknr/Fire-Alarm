package com.company.fireAlarm;

import com.company.singleton.Clipboard;

import java.util.ArrayList;
import java.util.List;

public class SmokeSensorState {

    //newspaper agency
    //which houses
    //need to have list of observers
    //have data bases -> subscribers
    //List vs. arraylist -> uses arrays
    boolean on = true;
    List<Users> users = new ArrayList<>(); //dont know size

    private static SmokeSensorState smokeSensor = null;

    public static SmokeSensorState getInstance(){
        if(smokeSensor==null){
            smokeSensor = new SmokeSensorState() ;
            Users users1 = new Resident();
            smokeSensor.subscribe(users1);
        }
        return smokeSensor;
    }
    //subscribe
    public void subscribe(Users users){
        //call the db and run a sql query to insert
        this.users.add(users);//will be gone in db
    }
    //unsubscribe
    public void unsubscribe(Users users){
        //call db and run a sql query to delete observer
        //soft vs. hard del
        this.users.remove(users);
    }

    public void notifyObservers(String news, Double state){
        for (Users users : this.users) {
            users.notifyObserver(news,state);
        }
    }

    public void Start() throws InterruptedException {
        while (on){
            System.out.println(Users.state);
//            Users.setState(700.00) ;
            if(Users.state >700){
                notifyObservers("fire alert  :",Users.state);
                Thread.sleep(4000);
            }
            Thread.sleep(1000);
        }
    }

    public void stop(){
        on = false;
    }
//    public void setObservers(List<Observer> observers) {
//        this.observers = observers;
//    }
}
