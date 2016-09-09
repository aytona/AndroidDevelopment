package com.aytona;
import java.util.Scanner;

public class NumberGuesser
{
    public static void GuessNumber(int numToGuess)
    {
        Scanner scan = new Scanner(System.in);
        for (int tries = 0; tries < 3 ; tries++)
        {
            int numTried = scan.nextInt();
            if (numTried == numToGuess)
            {
                System.out.println("Correct!");
                return;
            }
            else if (numTried < numToGuess)
            {
                System.out.println("Higher!");
            }
            else
            {
                System.out.println("Lower!");
            }
        }
    }
}
