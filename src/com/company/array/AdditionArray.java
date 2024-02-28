package com.company.array;

import java.util.Scanner;

public class AdditionArray {
    static  void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void arraysum(int[][] arr1, int[][] arr2, int r1, int r2, int c1, int c2){
        /*
         in addition the first_array row must be same with second_array row
         in addition the first_array column  must be same with second_array column
        */
        if (r1 != r2 || c1 !=c2){
            System.out.println("wrong array input:");
            return ;
        }
        int[][] sum= new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }

        }
        print(sum); /* print the sum_array by calling print method */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row for first matrix:");
        int r1= sc.nextInt();
        System.out.println("Enter the column for first matrix:");
        int c1=sc.nextInt();
        int [][] arr1 =new int[r1][c1]; /* array1 declaration*/
        System.out.println("Enter matrix value:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the row for second matrix:");
        int r2= sc.nextInt();
        System.out.println("Enter the column for second matrix:");
        int c2=sc.nextInt();
        int [][] arr2 =new int[r2][c2]; /* array1 declaration*/
        System.out.println("Enter matrix value:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        //print the first_matrix//
        System.out.println("matrix 1:");
        print(arr1);/* static method call */

        //print the second_matrix//
        System.out.println("matrix 2:");
        print(arr2);/*static method call*/

        //print the sum of two_matrix//
        System.out.println("Sum of two array is :");
        arraysum(arr1,arr2,r1,r2,c1,c2);/*static method call*/
    }
}
