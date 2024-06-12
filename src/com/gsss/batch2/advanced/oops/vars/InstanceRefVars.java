package com.gsss.batch2.advanced.oops.vars;
public class InstanceRefVars {
    String str;
    int num;
    boolean status;
    public static void main(String[] args) {
        InstanceRefVars obj = new InstanceRefVars();
        System.out.println(obj.str); // null
        System.out.println(obj.num); // 0
        System.out.println(obj.status); // false
    }
}
