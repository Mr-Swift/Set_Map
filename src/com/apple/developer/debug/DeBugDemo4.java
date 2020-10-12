package com.apple.developer.debug;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class DeBugDemo4 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"tom");
        map.put(2,"mack");
        map.put(3,"anven");
        Set keySet=map.keySet();
        Iterator iter= keySet.iterator();
        while (iter.hasNext()){
            Object key=iter.next();
            String value = (String) map.get(key);
            System.out.println(value);
            iter.remove();
        }
    }
}
