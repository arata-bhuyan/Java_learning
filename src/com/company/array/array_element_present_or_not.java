package com.company.array;

import java.util.Scanner;

public class array_element_present_or_not {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        int n,i;
        boolean isinarray=false;
        System.out.println("enter the array");
        for ( i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter your search element");
        n=s.nextInt();
        for (i=0;i<a.length;i++) {
            if (n == a[i]){
                isinarray=true;
                break;
            }
        }
        if (isinarray==true){
            System.out.println("element found in the array");
        }
        else {
            System.out.println("element not found");
        }

        /*for (int arata:a) {
            if (n == arata){
                isinarray=true;
                break;
            }
        }
        if (isinarray){
            System.out.println("element found in the array");
        }
        else {
            System.out.println("element not found");
        }
        */




    }
}
