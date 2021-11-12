package com.kodilla.bisectiondemo;


import java.util.Scanner;

public class BisectionDemoApplication
{
    static double accuracy = 0.001;

    static double function(double x)
    {
        return x*x*x - x*x;
    }

    static Scanner scanner = new Scanner(System.in);

    static void bisection(double min, double max)
    {
        if (function(min) * function(max) >= 0)
        {
            System.out.println("Wrong Digit Range!");
            return;
        }

        double x = Integer.MAX_VALUE;
        while ((max - min) >= accuracy)
        {
            x = (min + max) / 2;

            if (function(x) == 0.0)
            {
                break;
            }

            else if (function(x) * function(min) < 0)
                max = x;
            else
                min = x;
        }

        System.out.println("Root: " + x);
    }


    public static void main(String[] args)
    {

        System.out.print("Enter A:  ");
        double min = scanner.nextDouble();
        System.out.print("Enter B: ");
        double max = scanner.nextDouble();

        if(min > max)
            System.out.println("A Must Be Smaller Than B!");
        bisection(min, max);

    }

}
