package com.gsss.batch2.advanced.oops.innerClassConcept;
public interface Play { // Functional Interface
    void game();
}
class AnonymousInterface { // Java 8
    public static void main(String[] args) {
        Play p = () -> System.out.println("Football.!");
        p.game();
    }
}
