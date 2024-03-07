package com.company.array;

import java.util.Scanner;

public class Avg_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        int sum = 0;
        System.out.println("Enter your array element: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of the element is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("The sum of element is " + sum);
        System.out.println("The average is" + (sum/(3*2)));
    }
}
