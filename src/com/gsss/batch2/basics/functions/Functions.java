package com.gsss.batch2.basics.functions;
public class Functions {
    void display(){
        System.out.println("Display");
    }
    public void show(){
        System.out.println("Show");
    }
    public static void data(){
        System.out.println("Data");
    }
    public static void main(String[] args) {
        new Functions().display();
        new Functions().show();
        data();
    }
}
