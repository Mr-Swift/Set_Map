package com.apple.developer.package03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();
        map.put("001", new Student("张三", 20, "男", "南京"));
        map.put("002", new Student("安倍", 20, "男", "东京"));
        map.put("003", new Student("王二丫", 20, "女", "旧金山"));
        map.put("004", new Student("李四", 20, "男", "大兴安岭"));
        map.put("005", new Student("赵二狗", 20, "男", "长白山"));
        Set set = map.keySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            Student value = (Student) map.get(key);
            System.out.println(key + "-->" + value);
        }
        System.out.println("------------------------------------");
        Set set1 = map.entrySet();
        Iterator iter1 = set1.iterator();
        while (iter1.hasNext()) {
            Map.Entry entry = (Map.Entry) iter1.next();
            String key1 = (String) entry.getKey();
            Student value1 = (Student) entry.getValue();
            System.out.println(key1 + "-->" + value1);
        }
    }
}
