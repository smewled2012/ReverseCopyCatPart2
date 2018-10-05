package com.melak.library.org;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to Week Three Challenge - Reverse Copy Cat");
        Scanner input = new Scanner(System.in);
        String anothernumber;
        //do while loop works for checking whether the user needs to continue  to enter another number
        //after execution of tasks inside the loop or not and
        //it will continue if the user enters "y" and will end if the user enters "n"
        do
            {
                System.out.println("Enter a number");
                int number = input.nextInt();
                input.nextLine();
                // This for loop checks all the numbers less than a number the user enters down to 1
                //whether they are multiple of 5 or 7  or for both. and will:
                //          print out all the numbers which are  not multiple of 5 or 7.
                //          print "Copy" for multiples of 5, and "Cat" for multiples of 7.
                //          print "CopyCat" for Multiples of both.

                for(int i = number; i>=1; i--)
                {
                    if (i%7 ==0 &&(i%5 ==0) )
                    {
                        System.out.println("CopyCat");
                    }
                    else if (i%7 ==0)
                    {
                        System.out.println("Cat");
                    }
                    else if (i%5 ==0)
                    {
                        System.out.println("Copy");
                    }
                   else
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
