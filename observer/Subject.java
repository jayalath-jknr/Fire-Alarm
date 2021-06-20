package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    //newspaper agency
    //which houses
    //need to have list of observers
    //have data bases -> subscribers
    //List vs. arraylist -> uses arrays
    List<Observer> observers = new ArrayList<>(); //dont know size

    //subscribe
    public void subscribe(Observer observer){
        //call the db and run a sql query to insert
        observers.add(observer);//will be gone in db
    }
    //unsubscribe
    public void unsubscribe(Observer observer){
        //call db and run a sql query to delete observer
        //soft vs. hard del
        observers.remove(observer);
    }

    public void notifyObservers(String news){
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }

    public void start(){

    }
//    public void setObservers(List<Observer> observers) {
//        this.observers = observers;
//    }
}
