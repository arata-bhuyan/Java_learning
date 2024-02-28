package com.company.array;

import java.util.Scanner;

public class ArrayMulti {
    static void Mularray(int[][] arr1,int[][] arr2,int r1,int r2,int c1,int c2){
        if (c1 != r2) {
            System.out.println("Multiplication not possible :");
            return ;
        }
        int[][] mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    mul[i][j] += (arr1[i][k]* arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two matrix:");
        printArray(mul);
    }
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Entervale(int r,int c,int arr[][]){
        Scanner ar= new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= ar.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the row for 1st matrix :");
        int r1 = sc.nextInt();
        System.out.println("Enter the Column for 1st matrix:");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the matrix Value  :");
        Entervale(r1,c1, arr1);

        System.out.println("Enter  the row for 2nd matrix :");
        int r2 = sc.nextInt();
        System.out.println("Enter the Column for 2nd matrix:");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the matrix Value  :");
        Entervale(r2,c2,arr2);

        System.out.println("The first matrix is :");
        printArray(arr1);

        System.out.println("The second matrix is ");
        printArray(arr2);

        Mularray(arr1,arr2,r1,r2,c1,c2);
    }
}
