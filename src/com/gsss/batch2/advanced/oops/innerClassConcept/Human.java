package com.gsss.batch2.advanced.oops.innerClassConcept;
abstract class Human {
    abstract void play();
}
class A extends Human{
    @Override
    void play() {

    }
}
class AnonymousInner {
    public static void main(String[] args) {
        Human h = new Human() {
            @Override
            void play() {
                System.out.println("Football..!!");
            }
        };
        h.play();
    }
}
