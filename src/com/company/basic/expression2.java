package com.company;

public class expression2 {
    public static void main(String[] args) {
        //float a=(v*v -u*u)/2*a*s;
       
        //System.out.println(7*49/7+35/7);
        String name="Arata";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String nontrimmedstring="     arata      ";
        System.out.println(nontrimmedstring);
        String trimmedstring=nontrimmedstring.trim();
        System.out.println(trimmedstring);
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('r' ,'s'));
        System.out.println(name.replace("r" ,"ss"));
        System.out.println(name.startsWith("ar"));
        System.out.println(name.endsWith("ta"));
        System.out.println(name.charAt(4));
        String modifyname="Aarrraattaa";
        System.out.println(modifyname.indexOf("rra"));
        System.out.println(modifyname.indexOf("rra",4));
        System.out.println(modifyname.lastIndexOf("rra",7));
        System.out.println(name.equals("Arata"));
        System.out.println(name.equalsIgnoreCase("arata"));


    }
}
