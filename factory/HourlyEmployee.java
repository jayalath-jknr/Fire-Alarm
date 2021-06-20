package com.company.factory;

public class HourlyEmployee extends Employee {

    int hoursWorked;
    double rate;

    public HourlyEmployee(
            int id,
            String name,
            int hoursWorked,
            double rate
    ) {
        this.id =id;
        this.name =name;
        this.hoursWorked = hoursWorked;
        this.rate = rate;


    }

    @Override
    public double calcSalary() {
        return rate * hoursWorked;
    }
}

