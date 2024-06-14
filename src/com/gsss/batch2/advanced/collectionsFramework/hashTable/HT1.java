package com.gsss.batch2.advanced.collectionsFramework.hashTable;

import java.util.Hashtable;

public class HT1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anusha");
        ht.put(102, "Hasmitha");
        ht.put(117, "Sushmitha");
        ht.put(108, "Sinchana");
        // This is like an if else statement / ternary operator
        System.out.println(ht.getOrDefault(106, "Not Found"));
        System.out.println(ht.getOrDefault(101, "Not Found"));
    }
}
