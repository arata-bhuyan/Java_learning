package com.company.array;

import java.util.Scanner;

public class array_declare3_from_user {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int [] array=new int[5];
        System.out.println("enter the array");
        for (int i=0;i<array.length;i++){
            array[i]=a.nextInt();
        }
        System.out.println("the elements are\n");
        for (int name:array){
            System.out.println(name);
        }
    }
}
