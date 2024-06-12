package com.gsss.batch2.advanced.oops;
public class Constructor {
    int x;
    int y;
    Constructor(){
        x = 10;
        y = 20;
    }
    Constructor(int a, int b){
        x = a;
        y = b;
    }
    Constructor(float a, float b){
        x = (int) a;
        y = (int) b;
    }
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        System.out.println(obj1.x + " " + obj1.y);
        Constructor obj2 = new Constructor(1,2);
        System.out.println(obj2.x + " " + obj2.y);
        Constructor obj3 = new Constructor(2.45f, 1.25f);
        System.out.println(obj3.x + " " + obj3.y);
    }
}
