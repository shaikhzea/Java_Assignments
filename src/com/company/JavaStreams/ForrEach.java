package com.company.JavaStreams;
import java.util.*;
public class ForrEach {
    public static void main(String[] args){
        List<String> fruites= new ArrayList<>(Arrays.asList("Mango", "Apple", "Grapes", "Pineapple"));
          fruites.forEach(System.out::println);
    }
}
