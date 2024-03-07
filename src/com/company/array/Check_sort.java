package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Check_sort {
    static boolean arrayShort(int[] arr,int n)
    {

        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i]){
                return false;
            }

        // No unsorted pair found
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = sc.nextInt();
        System.out.println("Enter your array element :");
        int[] arr = new int[size];
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            {
                arr[i] = sc.nextInt();
            }
        }

        if (arrayShort(arr , n)) {
            System.out.println("Yes array is sorted.");
        }
        else {
            System.out.println("No! array is not sorted. ");
        }


    }
}
