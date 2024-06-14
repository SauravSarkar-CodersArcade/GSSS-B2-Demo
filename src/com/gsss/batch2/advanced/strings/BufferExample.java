package com.gsss.batch2.advanced.strings;

public class BufferExample {
    public void stringAppend(){
        StringBuffer sbf = new StringBuffer("Core");
        System.out.println("Old String: " + sbf);
        sbf.append(" Java");
        System.out.println("New String: " + sbf);
    }
    public void stringInsert(){
        StringBuffer sbf = new StringBuffer("JA"); // JA
        System.out.println("Old String: " + sbf);
        sbf.insert(1, "AV"); // JAVA
        System.out.println("New String: " + sbf);
    }
    public void stringReverse(){
        StringBuffer sbf = new StringBuffer("SSSG");
        System.out.println("Old String: " + sbf);
        sbf.reverse(); // GSSS
        System.out.println("New String: " + sbf);
    }

    public static void main(String[] args) {
        BufferExample bufferExample = new BufferExample();
        bufferExample.stringAppend();
        bufferExample.stringInsert();
        bufferExample.stringReverse();
    }
}
