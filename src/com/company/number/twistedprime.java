package com.company.number;

import java.util.Scanner;

public class twistedprime {
    int primecheck(int n){
        for (int i=2;i<=n/2;i++){
            if (n%i == 0) {
                return(0);
            }
        }
        return 1;
    }
    int reverse (int n){
        int rem=0,rev=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        twistedprime obj=new twistedprime();
        obj.primecheck(n);
        obj.reverse(n);
        if (obj.primecheck(n) == 1) {
            if (obj.primecheck(obj.reverse(n)) == 1) {
                System.out.println("the number is twisted prime:");
            }
        }
        else {
            System.out.println("the number is not twisted prime:");
        }
        // the number is prime then the reverse of this number also prime then the number is called twisted prime
    }
}
