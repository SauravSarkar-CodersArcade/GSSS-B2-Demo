package com.gsss.batch2.advanced.collectionsFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListExample {
    public void declarationExample(){
        List<String> list1 = new ArrayList<>();
        list1.add("Sam");
        list1.add("Tim");
        list1.add("Ron");
        new ListExample().readListData(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Sam");
        list2.add("Tim");
        list2.add("Ron");
        if (list1.equals(list2)){
            System.out.println("Equal lists");
        }else{
            System.out.println("Not equal");
        }
        list1.add(2, "Gsss");
        System.out.println("Updated list " + list1);
        if (list1.equals(list2)){
            System.out.println("Equal lists");
        }else{
            System.out.println("Not equal");
        }
        Collections.sort(list1);
        System.out.println("Updated list " + list1);
    }
    public void readListData(List<String> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        new ListExample().declarationExample();
    }
}
