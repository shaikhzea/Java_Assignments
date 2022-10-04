package com.company.javaStructureAndCollection;
import java.util.LinkedList;
import java.util.Queue;

public class Quee {
    public static void main(String[]args){
        Queue<Integer> qu=new LinkedList<>();
        qu.add(2);
        qu.add(4);
        qu.add(6);
        qu.add(8);
        System.out.println("printing even no:" +qu);
        qu.remove(6);
        System.out.println(qu);
        System.out.println("Queue Size:" +qu.size());

    }
}
