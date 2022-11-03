//Data Type and Operator
package com.edureka.assignments.module1;

public class Assignment1 {
    public static void main(String[] args) {

      //---Printing All Data Types with Values.-----

      int a = 12;
      char b = 'A';
      byte c = 1;
      float f = 2.5F;
      double d = 3.17d;
      short e = 123;
      long g = 12345678;
      boolean h = true;

        System.out.println(a); //INT
        System.out.println(b); //CHAR
        System.out.println(c); //BYTE
        System.out.println(d); //FLOAT
        System.out.println(e); //DOUBLE FLOAT
        System.out.println(f); //SHORT
        System.out.println(g); //LONG
        System.out.println(h); //BOOLEAN

      //Printing all arithmetic operations..
      int num1 = 20;
      int num2 = 10;
      //(+)
      int sum = num1 + num2;
      System.out.println(sum);
      //(-)
      int difference = num1 - num2;
      System.out.println(difference);
      //(*)
      int product = num1 * num2;
      System.out.println(product);
      //(/)
      int divide = num1 / num2;
      System.out.println(divide);
      //(%)
      int modulus = num1 % num2;
      System.out.println(modulus);
      //(++)
      int increment = ++num2;
      System.out.println(increment);
      //(--)
      int decrement = --num1;
      System.out.println(decrement);
    }
}
