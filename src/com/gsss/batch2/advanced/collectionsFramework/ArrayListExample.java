package com.gsss.batch2.advanced.collectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;
// Collections use Wrapper classes not primitive data
public class ArrayListExample {
    // Not the correct way
    public void nonGenericArrayListExample(){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("Test");
        list.add(1.2);
        System.out.println(list);
    }
    // Correct Way
    public void genericArrayListExample(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
    public void listIterateExample(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator = list.iterator();
        // for loop is never used for an iterator
        // always use while loop
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    public void listForEachExample(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Shravya");
        names.add("Kamakshi");
        names.add("Sushma");
        for (String name : names){
            System.out.print(name + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayListExample obj = new ArrayListExample();
        obj.nonGenericArrayListExample();
        obj.genericArrayListExample();
        obj.listIterateExample();
        obj.listForEachExample();
    }
}
