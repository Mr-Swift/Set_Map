package com.apple.developer.debug;

import java.util.Iterator;
import java.util.TreeSet;

public class DeBugDemo1 {
    public static void main(String[] args) {
        TreeSet set=new TreeSet<>();
        set.add("b");
        set.add("a");
        set.add("c");
        set.add("d");
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
