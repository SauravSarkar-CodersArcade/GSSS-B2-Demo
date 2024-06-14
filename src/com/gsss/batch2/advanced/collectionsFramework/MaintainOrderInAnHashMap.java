package com.gsss.batch2.advanced.collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MaintainOrderInAnHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("01", "Java");
        hm1.put("03", "Python");
        hm1.put("02", "JavaScript");
        hm1.put("04", "C++");
        System.out.println("Iterating Over HashMap:");
        for (Map.Entry<String, String> entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " <-> " + entry.getValue());
        }
        HashMap<String, String> hm2 = new LinkedHashMap<>();
        hm2.put("01", "Java");
        hm2.put("03", "Python");
        hm2.put("02", "JavaScript");
        hm2.put("04", "C++");
        System.out.println("Iterating Over LinkedHashMap:");
        for (Map.Entry<String, String> entry : hm2.entrySet()){
            System.out.println(entry.getKey() + " <-> " + entry.getValue());
        }
    }
}
