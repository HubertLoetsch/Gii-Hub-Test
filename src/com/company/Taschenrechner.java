package com.company;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {

        int num1;
        int num2;

        String operation;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number (1) ");
        num1 = input.nextInt();

        Scanner op = new Scanner(System.in);
        System.out.println("Please enter the operation");

        operation = op.next();

        System.out.println("Please enter the second number (2)");
        num2 = input.nextInt();


        if (operation.equals("+")) ;
        {
            System.out.println("+ You number is " + (num1 + num2));
        }

        if (operation.equals("-")) ;
        {
            System.out.println("- You number is " + (num1 - num2));
        }

        if (operation.equals("*")) ;
        {
            System.out.println("* You number is " + (num1 * num2));
        }

        if (operation.equals("/")) ;
        {
            System.out.println("/ You number is " + (num1 / num2));
        }

    }
}


