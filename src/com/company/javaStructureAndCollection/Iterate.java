package com.company.javaStructureAndCollection;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterate {
    public static void main(String[] args){
        ArrayList<Integer>arr =new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(40);
        arr.add(80);
        arr.add(160);
        Iterator<Integer> it= arr.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            if(i<=10){
                it.remove();
            }
        }
        System.out.println(arr);


    }
}
