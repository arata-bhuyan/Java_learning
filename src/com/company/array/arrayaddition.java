package com.company.array;

import java.util.Scanner;

public class arrayaddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        System.out.println("Enter the first array:");
        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the second array:");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("sum of two array :");
       for (int i=0;i<5;i++) {
           c[i] = a[i] + b[i];
       }
        for (int sum:c){
            System.out.print(sum+ " ");
        }

    }
}
