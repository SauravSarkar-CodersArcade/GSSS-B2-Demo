package com.gsss.batch2.advanced.oops;
public class ThisKeyword {
    // 'this' keyword refers to the current class instance variable
    int i; // Instance Variable
    void change(int i){
        this.i = i; // Ambiguity - Confusion
    }
    void display(){
        System.out.println("i is: " + i);
    }
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword();
        obj.change(20);
        obj.display();
    }
}
