package com.company.number;

import java.util.Scanner;

public class Amicable {
    static void  checkAmicableNumber(int n){
        int suma =0;
        int sumb =0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                suma = suma + i;
            }
        }
        //System.out.println(suma);
        int b = suma;
        for (int i = 1; i <=b/2 ; i++) {
            if (b % i == 0) {
              sumb +=i;
            }
        }
        //System.out.println(sumb);
        if (suma == b && sumb ==n) {
            System.out.println("yes ! the number is amicable number.");
        }
        else {
            System.out.println("no! The number is not amicable.");
        }
    }
    //data type of method void so no use the return type

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        /* using object if the method is static so we can call by using  classname.method_name or only method_name
        Amicable object = new Amicable();
        Amicable.checkAmicableNumber(n);
        checkAmicableNumber(n);
        static method can't not call by using  objectname.method_name
        object.checkAmicable(n);*/
        checkAmicableNumber(n);
        // 220 all divisible = 280 and 280 all divisible = 220 so it is amicable

    }
}
