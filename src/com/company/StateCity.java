package com.company;
import java.util.ArrayList;
import java.util.List;
public class StateCity {
    public static void main(String[] args){
        List <String> li=new ArrayList<String>();
        li.add("SriNagar");
        li.add("Pune");
        li.add("Banglore");
        li.add("Shimla");
        li.add("Gulmarg");
        List<String> li2=new ArrayList<String>();
        li2.add("Jammu & Kashmir");
        li2.add("Maharashtra");
        li2.add("Karnataka");
        li2.add("Himachal Pradesh");
        li2.add("Jammu & Kashmir");
        List<String> newList=new ArrayList<String>();
        newList.addAll(li);
        newList.addAll(li2);
        System.out.println("List Of Cities" +li);
        System.out.println("List of States" +li2);
        System.out.println("Showing te list of concanated list of city and state:" +newList);

    }
}
