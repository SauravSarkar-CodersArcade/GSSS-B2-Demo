package com.gsss.batch2.advanced.oops.iib;

public class IIBChild extends IIBParent{
    IIBChild(){
        System.out.println("Child Constructor.");
    }
    {
        System.out.println("IIB Child.");
    }
    public static void main(String[] args) {
        IIBChild obj = new IIBChild();
    }
    static {
        System.out.println("Child Static.");
    }
}
