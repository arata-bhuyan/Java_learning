package com.company;

import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner S= new Scanner(System.in);
        System.out.println(S.hasNextInt());
    }
}
