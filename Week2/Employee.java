package com.aytona;

/**
 * Created by Aytona on 2016-09-12.
 */
public class Employee
{
    String name;
    double hourlyPay;
    int yearOfHire;
    double hoursPerWeek;

    double getYearlySalary()
    {
        return hourlyPay * hoursPerWeek * 52;
    }

    double getYearsOfEmployment(int currentYear)
    {
        return currentYear - yearOfHire;
    }

    Employee() { }

    Employee(String name, double pay, int year, double week)
    {
        this.name = name;
        hourlyPay = pay;
        yearOfHire = year;
        hoursPerWeek = week;
    }
}
