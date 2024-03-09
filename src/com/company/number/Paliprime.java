package com.company.number;

import java.util.Scanner;

public class Paliprime {
    int checkPrime(int n){
        int flag = 0;
        int i= 2;
        while(i<=n/2){
            if (n % i == 0) {
               flag++;
               return 0;
            }
            i++;
        }
        return 1;
    }
    int palindromeCheck(int n){
        int rem =0;
        int r = n;
        int rev=0;
        while(n>0){
            rem = n%10;
            rev = rev * 10 + rem;
            n=n/10;
        }
        if (rev == r) {
            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        Paliprime object = new Paliprime();
        object.checkPrime(n);
        object.palindromeCheck(n);
        if (object.checkPrime(n) == 1) {
            if (object.palindromeCheck(n) == 1) {
                System.out.println("The number is Paliprime");
            }
            else{
                System.out.println("The number is not paliprime");
            }
        }
        // if the number is prime and also a palindrome number the this number is paliprime


    }
}
