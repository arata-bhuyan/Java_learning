package com.company.number;

import java.util.Scanner;

public class NextPrime {
    int Primecheck(int n){
        while(true){
            int f = 0;
            n++;
            for (int i = 2; i <=n/2; i++) {
                if (n % i == 0) {
                    f=1;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("The next prime number is " + n);
                break;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        NextPrime object = new NextPrime();
        object.Primecheck(n);
        // if the number is 6 the nearest prime is 7 is output.
    }
}
