package com.apple.developer.package02;

import java.util.HashSet;

@SuppressWarnings("all")
public class HashSetTestDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<Person>();
        set.add(new Person("狗剩", "001"));
        set.add(new Person("李四", "002"));
        set.add(new Person("王二", "003"));
        set.add(new Person("狗剩", "004"));
        set.add(new Person("狗剩", "005"));
        System.out.println(set);
    }
}
