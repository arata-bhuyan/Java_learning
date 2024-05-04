package com.company.basic;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the 1st mark:");
        float fst =Sc.nextFloat();
        System.out.println("enter the 2nd mark:");
        float snd=Sc.nextFloat();
        System.out.println("enter the 3rd mark:");
        float trd= Sc.nextFloat();
        float cgpa=(fst+snd+trd)/30;
        System.out.println("the total cgpa =" +cgpa);


    }
}
