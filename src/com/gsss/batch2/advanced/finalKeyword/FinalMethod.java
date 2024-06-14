package com.gsss.batch2.advanced.finalKeyword;

public class FinalMethod {
    final void college(){
        System.out.println("GSSS");
    }
}
class XYZ extends FinalMethod{
    // Cannot override a final method
//    void college(){
//        System.out.println("GSSS");
//    }
}
