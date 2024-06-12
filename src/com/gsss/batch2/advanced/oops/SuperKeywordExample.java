package com.gsss.batch2.advanced.oops;
class Doll {
    protected String type;
    public Doll(String type){
        this.type = type;
    }
    public void makeSound(){
        System.out.println("Doll makes a sound..!!");
    }
}
class Barbie extends Doll {
    private String model;
    public Barbie(String type, String model){
        super(type);
        this.model = model;
    }
    public void makeSound(){
        System.out.println("Barbie says: 'Hi, I'm Barbie!'");
    }
    void displayInfo(){
        System.out.println("Type: " + super.type);
        System.out.println("Model: " + this.model);
    }
}
public class SuperKeywordExample {
    public static void main(String[] args) {
        Barbie barbie = new Barbie("Fashion Doll",
                "DreamHouse Barbie");
        barbie.displayInfo();
        barbie.makeSound();
        // Scope Resolution Operator Classname::makeSound() -> C++
    }
}
