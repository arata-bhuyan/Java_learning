package com.company.array;

import java.util.Scanner;

public class sum_of_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] mat1=new int[2][3];
        int[][] mat2=new int[2][3];
        int[][] sum_mat=new int[2][3];
        System.out.println("Enter your 1st matrix:");
        for ( int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter your 2nd matrix:");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                mat2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Sum of two matrix");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                sum_mat[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum_mat[i][j] + " ");
            }
            System.out.println();
        }
       




    }
}
