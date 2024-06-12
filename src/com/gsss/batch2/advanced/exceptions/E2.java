package com.gsss.batch2.advanced.exceptions;
public class E2 {
    static void checkAge(int age){
        if (age >= 18){
            System.out.println("Eligible");
        }else{
            throw new RuntimeException("Access Denied");
        }
    }

    public static void main(String[] args) {
        checkAge(13);
    }
}
