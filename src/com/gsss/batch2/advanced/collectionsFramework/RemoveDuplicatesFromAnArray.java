package com.gsss.batch2.advanced.collectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "Java", "Python",
        "C", "C++", "C", "C++", "JavaScript", "SQL"};
        System.out.println("Before removing duplicates: ");
        for (String name : names){
            System.out.print(name + " ");
        }
        System.out.println();
        Set<String> uniqueNames = new LinkedHashSet<>();
        for (int i=0; i< names.length; i++){
            uniqueNames.add(names[i]);
        }
        System.out.println("After removing duplicates: ");
//        System.out.println(uniqueNames);
        // Lambda Expression to traverse a set ?
        uniqueNames.forEach(str -> System.out.println(str));
    }
}
