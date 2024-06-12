package com.gsss.batch2.advanced.oops.pillars.inheritance;

public class A {
    void methodA(){
        System.out.println("Method of class A");
    }
}
class B extends A {
    void methodB(){
        System.out.println("Method of class B");
    }
}
class C extends B {
    void methodC(){
        System.out.println("Method of class C");
    }
    public static void main(String[] args) {
        System.out.println("---------------");
        A obj1 = new A();
        obj1.methodA();
        System.out.println("---------------");
        B obj2 = new B();
        obj2.methodA();
        obj2.methodB();
        System.out.println("---------------");
        C obj3 = new C();
        obj3.methodA();
        obj3.methodB();
        obj3.methodC();
        System.out.println("---------------");
    }
}
