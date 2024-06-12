package com.gsss.batch2.advanced.oops.vars;
public class StaticRefVars {
    static String str = "GSSS";
    static int num = 12;
    static boolean status = true;
}
class Demo{
    public static void main(String[] args) {
        System.out.println(StaticRefVars.str); // null
        System.out.println(StaticRefVars.num); // 0
        System.out.println(StaticRefVars.status); // false
    }
}
