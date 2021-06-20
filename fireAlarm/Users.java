package com.company.fireAlarm;

public interface Users {

    Double state = 800.0 ;
//    static boolean stateChange = false;
    void notifyObserver(String news, Double state);
    //public static Double setState(Double newState);


}
