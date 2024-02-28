package com.company;

import java.util.Scanner;

public class kmtomile {
    public static void main(String[] args) {
        System.out.println("Enter the kilometer:");
        Scanner km = new Scanner(System.in);
        float km1 = km.nextFloat();
        float mile = (float) (0.6213711922)*km1;
        System.out.println("the miles=" +mile);


    }
}
