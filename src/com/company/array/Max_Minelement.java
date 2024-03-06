package com.company.array;

import java.util.Scanner;

public class Max_Minelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row & column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter your element:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max =arr[i][j];
                }
            }
        }
        System.out.println("The maximum  element is :" + max );
        int min =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                min=arr[0][0];
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        //System.out.println("The minimum  element is :" + min );
    }
}
