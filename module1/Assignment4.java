//If Condition
package com.edureka.assignments.module1;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        int num;

        //Taking input from user

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number");
        num = scan.nextInt();

        //Checking condition wether number is negative or postive

        if(num>0)
        {
            System.out.println("The number is positive.");
        }
        //checks the number is less than 0 or not

        else if(num<0)
        {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("You are Entering Zero");
        }
    }
}
