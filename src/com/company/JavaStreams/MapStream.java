package com.company.JavaStreams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapStream {
    public static void main(String[]args) {
        List<String> num=Arrays.asList("1","2","3","15","27","39");
        System.out.println("Number list:" +num);
        List<Integer> ma=num.stream()
                .map(s-> Integer.valueOf(s))
                .filter(number->number%3==0)
                .collect(Collectors.toList());
        System.out.println("Filtered List:" +ma);
    }
}
