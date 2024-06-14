package com.gsss.batch2.advanced.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        IntegerPrinter integerPrinter = new IntegerPrinter(10);
        integerPrinter.print();
        FloatPrinter floatPrinter = new FloatPrinter(2.4f);
        floatPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(45.7);
        doublePrinter.print();
        StringPrinter stringPrinter = new StringPrinter("GSSS");
        stringPrinter.print();
        GenericPrinter<Integer> genInt = new GenericPrinter<>(10);
        genInt.print();
        GenericPrinter<Float> genFloat = new GenericPrinter<>(10.5f);
        genFloat.print();
        GenericPrinter<Double> genDouble = new GenericPrinter<>(10.2);
        genDouble.print();
        GenericPrinter<String> genString = new GenericPrinter<>("GSSS");
        genString.print();
    }
}
