package com.company.javaStructureAndCollection;
import java.util.SortedMap;
import java.util.TreeMap;


public class SorttedMap {
    public static void main(String[] args){
        SortedMap<String,String> maps=new TreeMap<>();
        maps.put("India","Delhi");
        maps.put("SaudiArabia","Makka");
        maps.put("Switzerland","Bern");
        maps.put("UK","London");
        System.out.println("list of Countries with their Capitals" +maps);
        System.out.println("First Key:" + maps.firstKey());
        System.out.println("Last key:" + maps.lastKey());

    }
}
