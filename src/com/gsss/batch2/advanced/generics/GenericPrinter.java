package com.gsss.batch2.advanced.generics;

public class GenericPrinter <T> {
    T thingToPrint;
    GenericPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    void print(){
        System.out.println(thingToPrint);
    }
}
