package com.aytona;

class Vehicle
{
    int passengers;
    int fuelcap;
    int mpg;

    int range()
    {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles)
    {
        return (double) miles / mpg;
    }
}

class Minivan extends Vehicle
{
    Minivan()
    {
        passengers = 7;
        fuelcap = 16;
        mpg = 21;
    }
}

class Sportscar extends Vehicle
{
    Sportscar()
    {
        passengers = 2;
        fuelcap = 14;
        mpg = 12;
    }
}

public class TwoVehicles
{
    public static void main(String[] args)
    {
        Minivan minivan = new Minivan();
        Sportscar sportscar = new Sportscar();

        double gallons;
        int dist = 252;

        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");
    }
}
