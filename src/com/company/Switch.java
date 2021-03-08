package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int note = sc.nextInt();

        System.out.println("Hello world");

        switch (note) {
            case 1 -> System.out.println("sehr gut");
            case 2 -> System.out.println("gut");
            case 3 -> System.out.println("befriedigend");
            case 4 -> System.out.println("genügend");
            case 5 -> System.out.println("nicht genügend");
            default -> System.out.println("Falsche Eingabe!");


        }
    }
}

