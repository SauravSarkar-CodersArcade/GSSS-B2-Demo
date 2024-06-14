package com.gsss.batch2.advanced.generics;

public class DoublePrinter {
    Double thingToPrint;
    DoublePrinter(Double thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    void print(){
        System.out.println(thingToPrint);
    }
}
