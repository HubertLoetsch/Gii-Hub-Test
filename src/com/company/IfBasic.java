package com.company;

import java.util.Random;

public class IfBasic {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);

        if (randomNumber1 > 50 || randomNumber2 < 50) {
            System.out.println("Die Zahl 1 ist kleiner als Zahl 2 und mini ");

        }
        if (randomNumber1 > 30 && randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 3o");

        }
        if (randomNumber1 > 50 != randomNumber2 < 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }

    }
}