package com.company.array;

import java.util.Scanner;

public class array_from_user {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int [] array;
        array = new int[5];
        System.out.println("Enter the elements");
        for (int i=0;i<5;i++){
            array[i]= Sc.nextInt();
        }
        System.out.println("the elements are:\n");
        for (int element:array){
            System.out.println(element);
        }

    }
}
