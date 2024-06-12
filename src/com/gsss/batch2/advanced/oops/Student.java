package com.gsss.batch2.advanced.oops;
public class Student {
    int age;
    int rollNo;
    String name;
    static final String college = "GSSS";
    final int x;
    static final int y;
    static {
        y = 20;
    }
    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        x = 20;
    }
    void details(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sam", 23, 1);
        s1.details();
        Student s2 = new Student("Tim", 22, 2);
        s2.details();
    }
}
