package com.aytona;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Input Earth Weight: ");
        System.out.println(Moon.ConvertWeight(scan.nextFloat()));
    }
}
