package com.melak.library.org;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to Week Three Challenge - Reverse Copy Cat");
        Scanner input = new Scanner(System.in);
        String anothernumber;
        do
            {
                System.out.println("Enter a number");
                int number = input.nextInt();
                input.nextLine();
                for(int i = number; i>=5; i--)
                {
                    if (i%7 ==0 || i%5 ==0)
                    {
                        System.out.println(i);
                    }

                }
                System.out.println("\nWould you like to enter another number (y/n)");
                anothernumber= input.nextLine();
            }while(anothernumber.equalsIgnoreCase("y"));

        System.out.println("\nThank you for playing!");
    }
}
