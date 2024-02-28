package com.company.array;

import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter your element ");
        for (int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        int min=arr[0];
        for (int i=0;i<5;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum element is=" +min);
    }
}
