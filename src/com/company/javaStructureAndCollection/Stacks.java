package com.company.javaStructureAndCollection;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        Stack<String> Car=new Stack<>();
        Car.push("Audi");
        Car.push("Mercedes");
        Car.push("Farrari");
        Car.push("BMW");
        Car.push("Swift");
        System.out.println("Top Car Brand list: " +Car);
        Car.pop();
        System.out.println("Removed Car:" +Car);
    }
}
