package com.company.JavaStreams;
import java.util.Arrays;
import java.util.List;


public class Filters {
    public static void main(String[]args) {
        List<Integer> li=Arrays.asList(2,78,69,56,74);
        li.stream()
                .filter(num->num%2==0)
                .forEach(System.out::println);

    }
}
