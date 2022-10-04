package com.company.javaStructureAndCollection;

import java.util.EnumSet;
public class EnamSet {
    enum size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }
    public static void main(String[]args) {
        EnumSet<size> sizes= EnumSet.allOf(size.class);
        System.out.println("Enumset:" +sizes);

    }
}
