package com.apple.developer.debug;

import java.util.ArrayList;
import java.util.ListIterator;

@SuppressWarnings("all")
public class DeBugDemo3 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        ListIterator iter= list.listIterator(list.size());
        while(iter.hasPrevious()){
            Object obj = iter.previous();
            System.out.print(obj+" ");
        }
    }
}
