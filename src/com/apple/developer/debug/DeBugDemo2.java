package com.apple.developer.debug;

import java.util.ArrayList;

public class DeBugDemo2 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
       for(Object obj:list) {
            System.out.println(obj);
        }
    }
}
