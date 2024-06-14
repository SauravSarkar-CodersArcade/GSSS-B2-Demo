package com.gsss.batch2.advanced.generics;

public class StringPrinter {
    String thingToPrint;
    StringPrinter(String thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    void print(){
        System.out.println(thingToPrint);
    }
}
