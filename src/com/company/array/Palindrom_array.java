package com.company.array;

import java.util.Scanner;

public class Palindrom_array {
    static boolean ispalindrome(int[] array){
        int i =0;
        while (i< array.length/2){
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int[] array = new int[s];
        System.out.println("Enter the element:");
        for (int i = 0; i < s; i++) {
            array[i]= sc.nextInt();
        }
        boolean ispalin = ispalindrome(array);
        if (ispalin){
            System.out.println("your array is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

}

