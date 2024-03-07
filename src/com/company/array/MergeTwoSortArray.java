package com.company.array;

import java.util.Scanner;

public class MergeTwoSortArray {
    static  void input(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    static int[] merge(int[] arr1,int[] arr2){
        int newSize = arr1.length + arr2.length ;
        int[] newArray = new int[newSize];
        int i=0, j =0 , k=0 ;
        while (i < arr1.length || j < arr2.length){
            if ( j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArray[k]=arr1[i];
                i++;
                k++;
            }
            else{
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }


        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first array size");
        int ar1 = sc.nextInt();
        System.out.println(" Enter Second array size");
        int ar2 = sc.nextInt();
        int[] arr1 = new int[ar1];
        int[] arr2 = new int[ar2];
        System.out.println("Enter your first sorted array");
        input(arr1);
        System.out.println("Enter your second sorted array");
        input(arr2);
        int[] merge = merge(arr1,arr2);
        System.out.println("Your Merge Sort array :");
        for (int element:merge) {
            System.out.println(element);
        }
    }
}
