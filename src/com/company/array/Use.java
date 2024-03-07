package com.company.array;

import java.util.Scanner;

public class Use {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count = 0;
            System.out.println("Enter row & column :");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            System.out.println("Enter the elements:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the number to check no.of occurrence:");
            int ck = sc.nextInt();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if(ck == arr[i][j]){
                        count++;
                    }
                }

            }
            System.out.println("No.of  occurrence is " + count);

        }
}
