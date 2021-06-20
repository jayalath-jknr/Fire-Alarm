package com.company.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter type : ");

        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        System.out.println("Enter name : ");
        String name = scanner.next();

        System.out.println("Enter hours : ");
        Integer hours = scanner.nextInt();
        System.out.println("Enter rate : ");
        Double rate = scanner.nextDouble();

        EmployeeFactory employeeFactory= new  EmployeeFactory();
        Employee employee = employeeFactory.getInstance(type,name,hours,rate);
        System.out.println("Salary of Employee is : " + employee.calcSalary());

        // what is a factory ?
        //to make things
    }
}
