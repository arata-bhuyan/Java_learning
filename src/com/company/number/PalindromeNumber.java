package com.company.number;

import java.util.Scanner;

public class PalindromeNumber {
    static void reverse(int n){
        int t= n;
        int rem =0;
        int rev =0;
        while(n>0){
            rem = n%10;
            rev =rev *10 + rem;
            n = n/10;
        }
        if (rev == t) {
            System.out.println("The number is palindrome :");
        }
        else {
            System.out.println("Not a palindrome:");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        reverse(n);
    }
}
