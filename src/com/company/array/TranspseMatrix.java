package com.company.array;

import java.util.Scanner;

public class TranspseMatrix {

    static  void  Transpose(int[][] matrixes,int row,int col){
        int[][] trns =new int[col][row];
        /* we use row & col as presence of .len because we traverse the transpose matrix.
        and 1st use col because row of transpose matrix is the column of main matrix
         */
       for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                trns[i][j]=matrixes[j][i];
            }
        }
        Print(trns);
    }


    // without use of new matrix transpose of a matrix only for same column and row matrix
    /*static void TransposeInplace(int[][] matri,int row,int col){
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++) {
                // swap matri[i][j] ,matri[j][i]
                int temp =matri[i][j];
                matri[i][j]=matri[j][i];
                matri[j][i]=temp;
            }
        }
        Print(matri);
    }
    */
    static void Print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row And column:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter the values of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        Print(mat);

        System.out.println("The transpose of matrix is:");
        Transpose(mat,row,col);

        // without use of new matrix transpose of a matrix
        //System.out.println("The transpose of matrix without using new matrix:");
        //TransposeInplace(mat,row,col);
    }
}
