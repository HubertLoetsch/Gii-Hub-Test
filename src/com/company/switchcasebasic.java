package com.company;

import java.util.Scanner;

public class switchcasebasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int note = sc.nextInt();

        switch (note) {
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("genügend");
                break;
            case 5:
                System.out.println("nicht genügend");
                break;
            default:
                System.out.println("Falsche Eingabe!");
                break;

        }
    }
}
