package com.company.array;

import java.util.Scanner;

public class SumOf_Diagonal {

    static int leftsum(int[][] array){
        int sum = 0 ;
        int  i =0;
        while (i < array.length){
            sum += array[i][i];
            i++;
        }
        return sum;
    }
    static int rightsum(int[][] array){
        int sum = 0;
        int i =0;
        while (i< array.length){
            int col= array.length -1 -i;
            sum += array[i][col];
            i++;
        }
        return sum;

    }
    static int Sum(int[][] array){
        int lSum = leftsum(array);
        int rSum = rightsum(array);
        int sum = lSum + rSum;
        if (array.length %2 != 0) {
            int ind = array.length / 2;
            sum -= array[ind][ind];
        }
        return sum;
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
        int sum = Sum(array);
        System.out.println("Sum of two Diagonal is "+ sum );
    }
}
