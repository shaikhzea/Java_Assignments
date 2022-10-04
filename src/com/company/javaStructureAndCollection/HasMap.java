package com.company.javaStructureAndCollection;
import java.util.Map;
import java.util.HashMap;

public class HasMap {
    public static void main(String[]args) {
        Map<String,Integer> ma= new HashMap<String,Integer>();
        ma.put("Taj Mahal", 1);
        ma.put("Pyramid",2);
        ma.put("Wall of Chhina",3);
        ma.put("Colosseum",4);
        System.out.println("list of Wonders of world" +ma);
    }
}
