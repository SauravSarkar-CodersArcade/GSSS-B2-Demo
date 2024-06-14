package com.gsss.batch2.advanced.finalKeyword;

public class FinalVariable {
    final int x = 20;
//    x = 10; // Can't assign value
    static void display(final int a){
//        a = 10; // Can't assign new value
        // to the final parameter
        System.out.println(a);
    }
    public static void main(String[] args) {
        display(19);
    }
}
