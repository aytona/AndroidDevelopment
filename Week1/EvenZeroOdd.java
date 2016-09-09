package com.aytona;

public class EvenZeroOdd
{
    public static java.lang.String Outcome(int number)
    {
        if (number == 0)
        {
            return "Zero!";
        }
        else if (number % 2 == 0)
        {
            return "Even!";
        }
        else
        {
            return "Odd!";
        }
    }
}
