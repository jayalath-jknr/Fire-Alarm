package com.company.factory;

public class ContractBasedEmployee extends Employee{

    int hours;
    double rate;

    public ContractBasedEmployee(int id, String name ,int hours, double rate){
        this.id = id;
        this.name =name;
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    public double calcSalary() {
        return rate - rate*0.05;
    }
}
