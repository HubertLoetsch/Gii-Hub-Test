package com.company;

public class ForLoopcommands {
    public static void main(String[] args) {

        int a = 100, b = 0;

        for(int i = 1; i <= a; ++i)
        {

            b += i;
        }

        System.out.println("Sum = " + b);
    }
}
