package com.gsss.batch2.advanced.strings;

public class BuilderExample {
    public void stringAppend(){
        StringBuilder sbf = new StringBuilder("Core");
        System.out.println("Old String: " + sbf);
        sbf.append(" Java");
        System.out.println("New String: " + sbf);
    }
    public void stringInsert(){
        StringBuilder sbf = new StringBuilder("JA"); // JA
        System.out.println("Old String: " + sbf);
        sbf.insert(1, "AV"); // JAVA
        System.out.println("New String: " + sbf);
    }
    public void stringReverse(){
        StringBuilder sbf = new StringBuilder("SSSG");
        System.out.println("Old String: " + sbf);
        sbf.reverse(); // GSSS
        System.out.println("New String: " + sbf);
    }

    public static void main(String[] args) {
        BuilderExample bufferExample = new BuilderExample();
        bufferExample.stringAppend();
        bufferExample.stringInsert();
        bufferExample.stringReverse();
    }
}
