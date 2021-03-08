package com.company;

public class HelpMePls {
    public static void main(String[] args) {

        int a, b, c;
        for (a = 1; a <= 15; a++) {
            //
            for (b = 15; b >= a; b--) {
                System.out.print(" ");
            } //
            for (c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

