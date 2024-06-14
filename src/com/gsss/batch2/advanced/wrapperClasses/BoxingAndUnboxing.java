package com.gsss.batch2.advanced.wrapperClasses;
public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int num = 10;
        // Manually primitive -> Wrapper (Boxing)
        System.out.println(num);
        @Deprecated
        Integer num1 = new Integer(num);
        System.out.println(num1);
        // Automatically primitive -> Wrapper (AutoBoxing)
        Integer num2 = num;
        System.out.println(num2);
        // Again Wrapper -> Primitive -> Unboxing
        int num3 = num2.intValue(); // Unboxing
        System.out.println(num3);
        int num4 = num2; // AutoUnboxing
        System.out.println(num4);
        String str = "12";
//        System.out.println(str*2); // Not allowed
        Integer num_Str = Integer.parseInt(str);
        System.out.println(num_Str * 2);
    }
}
