package com.company.basic;

import java.util.Scanner;

public class Chapter4 {
    public static void main(String[] args) {
        //q1
        //int i =10;
        /*if (i=11){
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am not 11");
        }*/
        //q2
        /*Scanner s=new Scanner(System.in);
        System.out.println("Enter the math mark");
        int math=s.nextInt();
        System.out.println("Enter physics mark");
        int phy= s.nextInt();
        System.out.println("Enter chemistry mark");
        int che=s.nextInt();
        float total=(math+phy+che)/3.0f;
        if (total>40 && math>33 && phy>33 && che>33){
            System.out.println(" you pass");
        }
        else {
            System.out.println("you fail!");
        }*/

        //Q3
        /*float tax=0.0f;
        Scanner it=new Scanner(System.in);
        System.out.println("Enter your income in lakhs per anum ");
        float income=it.nextFloat();
        if (income<2.5f){
            System.out.println("tax="+tax+0);
        } else if (income>2.5f && income<=5.0f) {
            tax = tax+0.05f*(income-2.5f);
            System.out.println("tax="+tax);
        } else if (income>5f && income <=10.0f) {
            tax = tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income - 5.0f);
            System.out.println("tax="+tax);
        } else if (income>10.0f) {
            tax = tax+0.05f*(5.0f - 2.5f);
            tax = tax+0.2f*(10.0f-5.0f);
            tax = tax+0.3f*(income -10.0f);
            System.out.println("tax="+tax);
        }*/

        //q4
        /*Scanner d=new Scanner(System.in);
        System.out.println("Enter the day number :");
        byte day=d.nextByte();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("invalid day number!!");
        }*/

        //q5
        /*Scanner yr=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=yr.nextInt();
        if(year>1900 && year<2000){
            year=year%400;
            System.out.println("the year "+year+"is leap year");
        }
        else {
            System.out.println("not a leap year.");
        }*/

        //Q6
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your URL:");
        String url=sc.next();
        if(url.endsWith(".org")){
            System.out.println("it is an organisation website");
        } else if (url.endsWith(".com")) {
            System.out.println("it is a commercial website.");
        } else if (url.endsWith(".in")) {
            System.out.println("it is an indian website");
        }
        else {
            System.out.println("not a website");
        }*/
        // question number 5 incomplete

    }
}