package com.gsss.batch2.advanced.oops.pillars.encap;

import com.gsss.batch2.advanced.oops.Student;

public class Employees {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String name;
    private int salary;
}
class Encapsulation {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.setName("Sahana");
        e1.setSalary(35000);
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
}
