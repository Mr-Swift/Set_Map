package com.apple.developer.package01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTestDemo {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(0);
        arrayList.add('a');
        arrayList.add("b");
        arrayList.add(0.5);
        arrayList.add(true);
        arrayList.add(3.141592);
        arrayList.add(3.14);
        arrayList.add(new Integer(0));
        arrayList.add(new Double(3.1415));
//        //foreach
//        for (Object obj : arrayList) {
//            System.out.print(obj + "\t");
//        }
//        System.out.println();
//        //for循环
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + "\t");
//        }
//        System.out.println();
        //Iterator迭代器
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.print(obj + "\t");
        }
        System.out.println();
        //ListIterator.next()
        ListIterator list = arrayList.listIterator(0);
        while (list.hasNext()) {
            Object obj = list.next();
            System.out.print(obj + "\t");
        }
        System.out.println();
        //ListIterator.previous
        ListIterator list1 = arrayList.listIterator(arrayList.size());
        while (list.hasPrevious()) {
            Object obj = list.previous();
            System.out.print(obj + "\t");
        }
    }
}
