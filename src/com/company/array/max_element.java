package com.company.array;

import java.util.Scanner;

public class max_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[5];
        int max;
        System.out.println("Enter your element ");
        for (int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        max=arr[0];
        for (int i=0;i<5;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element is=" +max);
    }
}
