package com.gsss.batch2.advanced.collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("Java");
        names.add("Java");
        names.add("Java");
        names.add("Python");
        names.add("Python");
        names.add("Python");
        System.out.println(names);
        HashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(12);
        nums.add(12);
        nums.add(12);
        System.out.println(nums);
        System.out.println(names.contains("Python"));
    }
}
