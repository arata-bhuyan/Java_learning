package com.company.number;

import java.util.Scanner;

public class NeonNumber {
    int SumofDigit(int c){
        int rem;
        int sum =0;
        int number = c;
        while(c>0){
            rem = c % 10;
            sum = sum + rem;
            c = c/10;
        }
    return sum;
    }
    public static void main(String[] args) {
        // n=9 ,9*9 = 81 sum of square i.e 8+1= n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int c = n * n;
        NeonNumber object = new NeonNumber();
        int sum =object.SumofDigit(c);
        if (n==sum){
            System.out.println("The number is Neon number");
        }
        else {
            System.out.println("The number is not Neon number:");
        }

    }
}
