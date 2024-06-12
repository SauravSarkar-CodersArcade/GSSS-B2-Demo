package com.gsss.batch2.advanced.oops.pillars.inheritance;
public class Employee {
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void empDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}
class Developer extends Employee {
    Developer(String name, int salary) {
        super(name, salary);
    }
    public static void main(String[] args) {
        Developer d = new Developer("Ramya", 40000);
        d.empDetails();
    }
}
