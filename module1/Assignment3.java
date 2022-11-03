//If Condition

package com.edureka.assignments.module1;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int age, shrt;

        // taking values from user at run time

        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter your age");
        age = scan.nextInt();

        // Checking condition for voting..

        if (age >= 18) {
            System.out.println("Welcome to voting system Yo can Vote");
        } else {
            shrt = (18 - age);
            System.out.println("Sorry,You can vote after :" + shrt + " years");
        }

    }
}
