package com.gsss.batch2.advanced.oops.pillars.abstraction;
abstract class Animals {
    // 1. Concrete or normal method
    // 2. abstract method
    abstract void color();
    void eat(){
        System.out.println("Eating food..!!");
    }
}
class Cat extends Animals{
    void color(){
        System.out.println("Black");
    }
}
class Panda extends Animals{
    void color(){
        System.out.println("Black N White");
    }
}
class AbstractAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Panda panda = new Panda();
        cat.color();
        cat.eat();
        panda.eat();
        panda.color();
    }
}
