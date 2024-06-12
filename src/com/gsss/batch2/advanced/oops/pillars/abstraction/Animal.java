package com.gsss.batch2.advanced.oops.pillars.abstraction;

public interface Animal { // 100% Abstraction // PVF
    void color();
    void speed();
}
class Cats implements Animal{
    public void color(){
        System.out.println("Cat is black.!!");
    }
    public void speed(){
        System.out.println("Cat is fast..!!");
    }
}
class Pandas implements Animal{
    public void color(){
        System.out.println("Panda is black n white.!!");
    }
    public void speed(){
        System.out.println("Panda is very slow..!!");
    }
}
class InterfaceAnimals {
    public static void main(String[] args) {
        Cats cats = new Cats();
        Pandas pandas = new Pandas();
        cats.color();
        cats.speed();
        pandas.color();
        pandas.speed();
    }
}
