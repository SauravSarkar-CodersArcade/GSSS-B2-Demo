package com.gsss.batch2.advanced.strings;

public class PracticalTimeComplexity {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("GSSS");
        for (int i=1; i<1000000; i++){
            sbf.append("IETW");
        }
        System.out.println("Buffer time: " +
                (System.currentTimeMillis()-startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("GSSS");
        for (int i=1; i<1000000; i++){
            sbl.append("IETW");
        }
        System.out.println("Builder time: " +
                (System.currentTimeMillis()-startTime) + "ms");
    }
}
