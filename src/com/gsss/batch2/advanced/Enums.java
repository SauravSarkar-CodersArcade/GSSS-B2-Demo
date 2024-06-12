package com.gsss.batch2.advanced;
enum Priority {
    HIGH, LOW, MEDIUM
}
public class Enums {
    public static void main(String[] args) {
        Priority priority = Priority.LOW;
        System.out.println(
                "The bug has " + priority + " priority.");
        for (Priority p : Priority.values()){
            System.out.println("Priority <-> " + p);
        }
    }
}
