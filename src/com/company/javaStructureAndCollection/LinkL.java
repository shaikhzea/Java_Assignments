package com.company.javaStructureAndCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkL {
    public static void main(String[]args){
        List<String> li=new LinkedList();
        li.add("Sam");
        li.add("Sachi");
        li.add("Amruta");
        li.add("Uzma");
        System.out.println("Showing  of employee list:" +li);
        String st=li.remove(0);
        System.out.println("Showing removed employee:" +st);
        int si=li.size();
        System.out.println("size of lis:" +si);

    }
}
