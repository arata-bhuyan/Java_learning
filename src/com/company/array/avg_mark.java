package com.company.array;

import java.util.Scanner;

public class avg_mark {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] marks=new int[5];
        int i,sum=0;
        System.out.println("enter marks:");
        for (i=0;i< marks.length;i++){
            marks[i]=a.nextInt();
        }
        for(int arata:marks){
            sum=sum+arata;
        }
        System.out.println( " The average marks is =" +sum/marks.length);

    }
}
