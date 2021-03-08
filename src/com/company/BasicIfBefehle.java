package com.company;

import java.util.Random;

public class BasicIfBefehle {
    public static void main(String[] args) {


            Random random = new Random();
            int randomNumber = random.nextInt(100);


            if ((randomNumber < 50) && (randomNumber > 20)) {
                System.out.println("Medium");

            } else if (randomNumber > 20) {
                System.out.println("Mini");

            } else if (randomNumber < 50) {
                System.out.println("Large");

            }
        }
    }