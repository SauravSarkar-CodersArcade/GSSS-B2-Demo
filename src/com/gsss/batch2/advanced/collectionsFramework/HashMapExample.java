package com.gsss.batch2.advanced.collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> menuItems = new HashMap<>();
        menuItems.put("Biryani", 150);
        menuItems.put("Kebab", 100);
        menuItems.put("Ragi Mudde", 50);
        System.out.println(menuItems);
        for (String items : menuItems.keySet()){
            System.out.println(items);
        }
        for (Integer prices : menuItems.values()){
            System.out.println(prices);
        }
        for (Map.Entry<String, Integer> entry : menuItems.entrySet()){
            System.out.println("Item: " + entry.getKey() +
                    " <-> " + " Price: " + entry.getValue());
        }
    }
}
