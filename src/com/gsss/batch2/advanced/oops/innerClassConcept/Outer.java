package com.gsss.batch2.advanced.oops.innerClassConcept;
public class Outer {
    private int value = 20;
    class Inner {
        void display(){
            System.out.println("The value is: " + value);
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        // OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner in = out.new Inner();
        in.display();
    }
}
