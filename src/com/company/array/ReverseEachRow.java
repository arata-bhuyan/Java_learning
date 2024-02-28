package com.company.array;

import java.util.Scanner;

public class ReverseEachRow {

    static void Reverse(int[][] matrix ){
        int l = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < l ; i++) {
            for (int j = c-1; j >= 0 ; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Print(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row & column:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println(" Enter the values for the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        Print(matrix);
        System.out.println("The each row reverse matrix is :");
        Reverse(matrix);


    }
}
