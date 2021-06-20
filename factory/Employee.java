package com.company.factory;

public abstract class Employee {

    //properties and
    int id;
    String name;

    //methods
    public abstract double calcSalary();
}
//public class Employee {
//    //properties and
//    String id;
//    String name;
//    String type;
//    double rate;
//    int hoursWorked;
//    int daysWorked;
//
//    //methods
//    public double calcSalary(){
//        //hourly paid -> rate * hours
//        if(this.type.equals("hourly")){
//            return this.rate * this.hoursWorked;
//        }
//        if(this.type.equals("daily")){
//            return this.rate + this.daysWorked;
//        }
//        //monthly paid employees
//        if(this.type.equals("monthly")){
//            return rate;
//        }
//        return 0;
//
//        //open-close principle - your code should be open for modification
//        //closed for modification
//
//        //intern rate
//        //probationary rate -> hoursWorked
//
//    }
//}