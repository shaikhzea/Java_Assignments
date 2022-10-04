
package com.company;


import java.util.*;

public class Anagram {
    public  static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String str=sc.nextLine();
        System.out.println("Enter second string");
        String str1=sc.nextLine();
        if(str.length()==str1.length()){
            char[] x=str.toCharArray();
            char[] y=str1.toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);
            boolean res=Arrays.equals(x,y);
            if(res==true){
                System.out.println(str + "and" +str1 +"are Anagram");
            }else{
                System.out.println(str + "and" +str1 + "are not Anagram");
            }

        }
        sc.close();
    }

}