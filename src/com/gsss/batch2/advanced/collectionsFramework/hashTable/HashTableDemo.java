package com.gsss.batch2.advanced.collectionsFramework.hashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anusha");
        ht.put(102, "Hasmitha");
        ht.put(117, "Sushmitha");
        ht.put(108, "Sinchana");

        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " <-> " +
                    "Value: " + value);
        }
        ht.remove(102);
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " <-> " +
                    "Value: " + value);
        }
    }
}
