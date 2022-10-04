package com.company.javaStructureAndCollection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSett {
    public static void main(String[]args) {
        Set<Integer>st=new TreeSet<Integer>();
        st.add(100);
        st.add(200);
        st.add(300);
        System.out.println("Displaying list" +st);
        System.out.println("Accessing element using Iterator()");
        Iterator<Integer>iterator=st.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(",");
        }

    }
}
