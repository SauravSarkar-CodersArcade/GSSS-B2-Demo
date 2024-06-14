package com.gsss.batch2.advanced.generics;

public class IntegerPrinter {
    Integer thingToPrint;
    IntegerPrinter(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    void print(){
        System.out.println(thingToPrint);
    }
}
