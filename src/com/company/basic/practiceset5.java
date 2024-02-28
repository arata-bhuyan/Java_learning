package com.company;

import java.util.Scanner;

public class practiceset5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1
        /*int n=4;
        for (int i=4;i>0;i--){
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }*/
        //or ------or
        /*int n=4;
        for(int i =1;i<=n;i++){
            for (int j=4;j>i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }  */

        //Q2
        /*int n=sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++){
            sum=sum +(2*i);
        }
        System.out.println(sum);*/

        //Q3
        /*int n= sc.nextInt();
        for (int i=1;i<=10;i++){
            //System.out.printf("%d x %d = %d \n",n,i,n*i);
            System.out.println(n +"x" + i+ "="+n*i);
        }*/

        //Q4
        /*int n= sc.nextInt();
        for (int i=10;i>=1;i--){
            System.out.println(n +"x" + i+ "="+n*i);
        }*/

        //Q5
        /*int n=sc.nextInt();
        int fact=1;
        if (n==0){
            System.out.println("factorial="+fact);
        }
        else {
            for (int i = 1; i <= n; i++){
                fact=fact*i;
            }
            System.out.println("factorial ="+fact);
        }*/

        //Q6
        /*int n= sc.nextInt();
        int fact=1;
        int i=1;
        while (i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial ="+fact);
         */

        //Q7 repet question 1 using while loop.

        //Q8-ans true

        //Q9
        /*int n= sc.nextInt();
        int sum =0;
        for (int i=1;i<=10;i++){
            System.out.println(n +"x" + i+ "="+n*i);
            sum=sum+(n*i);
        }
        System.out.println("sum of multiplication table =" +sum);
        */

        //Q10


        //Q11 repet Quetion 2 using while




    }
}
