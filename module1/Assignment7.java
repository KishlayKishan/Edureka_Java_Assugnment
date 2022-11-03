//Loop
package com.edureka.assignments.module1;

public class Assignment7 {
    public static void main(String[] args)
    {
        int a;

        System.out.println("Enter number to print all even and odd until: ");

        System.out.println("10 Even Numbers are: \n");
        for(a = 1; a <= 20; a++)
        {
            if(a % 2 == 0)
            {
                System.out.print(a + "\n");
            }
        }
        System.out.println("10 Odd Numbers are: \n");
        for(a = 1; a <= 20; a++)
        {
            if(a % 2 == 1)
            {
                System.out.print(a + "\n");
            }
        }

    }
}
