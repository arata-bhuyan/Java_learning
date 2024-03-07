package com.company.array;

import java.util.Scanner;

public class SearchElement {
    static  boolean  Search(int[][] arr1,int n){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] == n) {
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row & column size:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter your Element:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter number you want to search:");
        int n = sc.nextInt();
        boolean isfound = Search(array,n);
        if (isfound){
            System.out.println("your number is found");
        }
        else {
            System.out.println("Number not found !");
        }
    }
}
