package com.company.number;

import java.util.Scanner;

public class primenumber{
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        for (int i=2;i<=n/2;i++){
            if (n%i==0) {
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("the number is a prime number");
        }
        else {
            System.out.println("the number is not prime number");
        }
    }
}
