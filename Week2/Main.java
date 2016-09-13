package com.aytona;

public class Main
{
    public static void main(String[] args)
    {
        Employee wahid = new Employee("Wahid", 12, 2014, 30);
        Employee derek = new Employee("Derek", 13, 2013, 35);
        Employee carlo = new Employee("Carlo", 11, 2015, 20);

        System.out.println(carlo.name + " Earns " + carlo.hourlyPay + " Works " + carlo.hoursPerWeek);
        System.out.println("Wahid has been working here for " + wahid.getYearsOfEmployment(2016) + " years");
        System.out.println("Derek gets paid " + derek.getYearlySalary() + " yearly");
    }
}
