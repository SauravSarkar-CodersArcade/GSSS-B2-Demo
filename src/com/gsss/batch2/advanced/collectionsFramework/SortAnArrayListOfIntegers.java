package com.gsss.batch2.advanced.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayListOfIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(21);
        numbers.add(11);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(13);
        numbers.add(17);
        System.out.println("Before: " + numbers);
        Collections.sort(numbers);
        System.out.println("After: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reverse: " + numbers);
    }
}
