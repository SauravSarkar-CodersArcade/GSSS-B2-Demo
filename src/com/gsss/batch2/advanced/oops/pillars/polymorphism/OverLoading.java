package com.gsss.batch2.advanced.oops.pillars.polymorphism;
public class OverLoading {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(float a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(2.4f, 3.4f);
    }
}
