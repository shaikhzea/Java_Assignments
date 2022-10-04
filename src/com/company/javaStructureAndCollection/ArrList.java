package com.company.javaStructureAndCollection;
import java.util.*;
import java.util.ArrayList;


public class ArrList {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(60);
        num.add(70);
        num.add(80);
        num.add(90);
        num.add(100);
        System.out.println("Numbers:" + num);
        int number = num.get(1);
        System.out.println("Accesssed Number:" + number);
        int nums = num.remove(0);
        System.out.println("Removed Number:" + nums);
    }
}

