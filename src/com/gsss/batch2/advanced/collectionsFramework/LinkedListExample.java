package com.gsss.batch2.advanced.collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    void simpleLinkedListExample(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Sam");
        names.add("Tim");
        names.add("Ron");
        Iterator itr = names.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new LinkedListExample().simpleLinkedListExample();
    }
}
