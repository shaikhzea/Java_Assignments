package com.company.javaStructureAndCollection;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[]args){
        TreeMap<String,Integer> tmap=new TreeMap<>();
        tmap.put("Virat Kohli", 1);
        tmap.put("Babar Azam",2);
        tmap.put("Trent Boult", 3);
        tmap.put("Rohit Sharma",4);
        tmap.put("Imam-ul-Haq", 5);
        tmap.put("Shakib-ul-Hasan",6);
        System.out.println("List of ICC top Player:" +tmap);
        int rm= tmap.remove("Trent Boult");
        System.out.println("Removed Player:" +rm);


    }
}
