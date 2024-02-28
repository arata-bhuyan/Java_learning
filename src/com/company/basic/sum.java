package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter the first number:");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        System.out.println("Enter the second number:");
        int b = Sc.nextInt();
        System.out.println("Enter the third number:");
        int c= Sc.nextInt();
        int total=  a+b+c;
        System.out.println("Total=" +total);

    }
}
