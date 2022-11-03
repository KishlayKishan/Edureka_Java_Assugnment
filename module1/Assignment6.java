//If Condition

package com.edureka.assignments.module1;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        int num;

        //Taking input from user

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a number");
        num = scan.nextInt();

        //Checking condition wether number is Even or Odd

        if(num%2==0)
        {
            System.out.println("The number is Even.");
        }

        else {
            System.out.println("The Number is Odd");
        }
    }
}
