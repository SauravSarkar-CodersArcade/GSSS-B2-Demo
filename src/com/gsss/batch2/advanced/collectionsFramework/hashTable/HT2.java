package com.gsss.batch2.advanced.collectionsFramework.hashTable;
import java.util.Hashtable;
public class HT2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anusha");
        ht.put(102, "Hasmitha");
        ht.put(117, "Sushmitha");
        ht.put(108, "Sinchana");
        System.out.println("Initial table: " + ht);
        // Insert a value if absent
        ht.putIfAbsent(109, "Kamakshi");
        System.out.println("Final table: " + ht);
        ht.put(117, "Sushmitha");
        System.out.println("Final table: " + ht);
    }
}
