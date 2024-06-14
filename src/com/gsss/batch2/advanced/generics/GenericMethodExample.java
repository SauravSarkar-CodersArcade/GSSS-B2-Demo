package com.gsss.batch2.advanced.generics;

public class GenericMethodExample {
    // Generic method to find the max of two same data types
    public static <T extends Comparable<T>> T findMax(T a, T b){
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        Integer maxInt = findMax(10,20);
        System.out.println("Max Integer: " + maxInt);
        String maxString = findMax("Apple", "Banana");
        System.out.println("Max String: " + maxString);
    }
}
