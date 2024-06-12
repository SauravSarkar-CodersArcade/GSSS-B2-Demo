package com.gsss.batch2.advanced.exceptions;

public class E3 { // Exception Propagation...!!!
    public static void functionC(){
        System.out.println("Function Start: C");
        throw new RuntimeException("Error in C");
//        System.out.println("Function End: C");
    }
    public static void functionB(){
        System.out.println("Function Start: B");
        functionC();
        System.out.println("Function End: B");
    }
    public static void functionA(){
        System.out.println("Function Start: A");
        try {
            functionB();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Exception caught in function A.");
        }
        System.out.println("Function End: A");
    }
    public static void main(String[] args) {
        functionA();
    }
}
