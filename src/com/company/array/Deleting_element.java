package com.company.array;

import java.util.Scanner;

public class Deleting_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int[] arr = new int[s];
        int[] Dltarr = new int[s-1];
        System.out.println("Enter the Element of array:");
        for (int i = 0; i < s; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number want to delete:");
        int dlt = sc.nextInt();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != dlt) {
                Dltarr[k]=arr[i];
                k++;
            }

        }
        System.out.println("The new array is :");
        for (int element:Dltarr) {
            System.out.println(element);
        }
    }
}
