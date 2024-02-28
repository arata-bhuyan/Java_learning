package com.company.array;

import java.util.Scanner;

public class sum_of_arrayelement {
    public static void main(String[] args) {
        float sum=0.0f;
        Scanner sc=new Scanner(System.in);
        float[] arr =new float[5];
        System.out.println("Enter your array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextFloat();
        }
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
         /*-------OR-----    [use for.....each loop()]   -----*/

        /*for (float element : arr) {
            sum = sum + element;
        }*/

        System.out.println("sum of array element is" + sum);

    }
}
