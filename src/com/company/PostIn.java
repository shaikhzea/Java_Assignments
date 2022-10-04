package com.company;

import java.util.Scanner;

public class PostIn {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter Your Input :" + "\n");
        str=sc.nextLine();
        System.out.println("Input" +str +"\n");
        String str1=str.substring(0,3);
        System.out.println(str1);
        String str2=str.substring(3,4);
        System.out.println(str2);
        String str3=str.substring(4,7);
        System.out.println(str3);
        String str4=str1+str2+str3;
        System.out.println("\n" + "Output: "+" ("+str1+")"+str2+"("+str3+")");
    }
}
