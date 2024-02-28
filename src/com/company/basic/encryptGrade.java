package com.company;

public class encryptGrade {
    public static void main(String[] args) {
        char grade='a';
        //encrypting result
        // grade=grade+8 --wrong due to result it become integer
        grade = (char)+(grade+8); // grade+=8; --it is another method
        System.out.println(grade);
        // decrypting result
        grade = (char)(grade-8); //grade-=8;  --another method
        System.out.println(grade);

    }
}
