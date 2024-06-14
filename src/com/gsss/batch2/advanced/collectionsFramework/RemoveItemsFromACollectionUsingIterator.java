package com.gsss.batch2.advanced.collectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsFromACollectionUsingIterator {
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
        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if (i > 10){
//                it.remove();
//            }
//        }
        numbers.removeIf(i -> i < 10); // lambda Expressions
        System.out.println(numbers);
        // Why not use a for loop
        // Because the size of the Collection is constantly changing
    }
}
