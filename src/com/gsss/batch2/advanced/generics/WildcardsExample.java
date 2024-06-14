package com.gsss.batch2.advanced.generics;
import java.util.ArrayList;
import java.util.List;
public class WildcardsExample {
    // Method to print the elements of a list using WildCards
    public static void printList(List<?> list){
        // We have to use the Object Class for traversal
        for (Object element : list){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(1);
        integerList.add(12);
        List<String> nameList = new ArrayList<>();
        nameList.add("GSSS");
        nameList.add("VVCE");
        nameList.add("MIT");

        System.out.println("Printing the integer list: ");
        printList(integerList);
        System.out.println("Printing the name list: ");
        printList(nameList);
    }
}
