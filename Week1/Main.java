package com.aytona;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Input Earth Weight: ");
        System.out.println(Moon.ConvertWeight(scan.nextFloat()));
        System.out.println("Input Number: ");
        System.out.println(EvenZeroOdd.Outcome(scan.nextInt()));
        System.out.println("Number Guesser: ");
        java.util.Random rand = new Random();
        int randNum = rand.nextInt(9) + 1;
        NumberGuesser.GuessNumber(randNum);
    }
}
