package org.example;

import java.util.*;

public class third {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("DotNet");

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Grapes");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("\n"+"list");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("\n"+"Set");
        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("\n"+"Map");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
