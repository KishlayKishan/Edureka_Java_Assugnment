package com.edureka.assignments.module1;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number");
        num1 = scan.nextInt();
        System.out.println("Enter Second Number");
        num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("First Number is Greater than Second");
        }
        else {
            System.out.println("Second Number is greater than First");
        }

    }

}
