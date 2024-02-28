package com.company.array;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] ar=new int[7];
        int temp;
        System.out.println("enter your array");
        for (int i=0;i<7;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("before Swapping ");
        for (int element :ar){
            System.out.println(element);
        }
        for (int i=0;i<7;i++){
            //swap ar[i] and ar[n-1-i]
            temp=ar[i];
            ar[i]=ar[7-1-i];
            ar[7-1-i]=temp;
        }

    }
}
