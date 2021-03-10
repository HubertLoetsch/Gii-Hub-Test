package com.company;

public class ForLoopcommands {
    public static void main(String[] args) {
        //Das ist die Aufgabe For Loop2

        int sum =0;


        for(int x=1; x <= 1000; x ++) {

            if(x % 2 ==0){
                sum += x;
            }
        }

        System.out.println("sum:"+sum);
    }
}
