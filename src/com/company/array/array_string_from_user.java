package com.company.array;

import java.util.Scanner;

public class array_string_from_user {
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        // string declare in an array;
        String [] array=new String[5];
        System.out.println("enter the string value:\n");
        for (int i=0;i<array.length;i++){
            //taking the string  input then store in [i] position
            array[i]=ar.next();
        }
        System.out.println("the strings array are:\n");
        //use of for-each loop;
        for(String h:array){
            System.out.println(h);
        }
    }
}
