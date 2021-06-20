package com.company.factory;

public class EmployeeFactory {
    public Employee getInstance(String type, String name, Integer hours, Double rate ){
        Employee employee = null;
        // this ifs wii modified
        if(type.equals("hourly")){
            employee = new HourlyEmployee( 1,name,hours,rate);

        }
        else if(type.equals("monthly")) {
            employee = new MonthlyEmployee(2, name,rate);
        }
        else if(type.equals("Daily")) {
            //todo : create daily Employee
//            Employee employee2 = new MonthlyEmployee(3, name,rate);
//            System.out.println("Salary of Kamal is : " + employee2.calcSalary());
        }
        else if(type.equals("contract")) {
            return new ContractBasedEmployee(5,"name",10,0.5);
        }
        return employee;
    }
}
