package com.gsss.batch2.advanced.oops.pillars.inheritance;
public interface Browser1 {
    void browser1();
}
interface Browser2 {
    void browser2();
}
interface Browser3 {
    void browser3();
}
class Browsers implements Browser1, Browser2, Browser3{

    public void browser1() {
        System.out.println("Google Chrome..!!");
    }

    public void browser2() {
        System.out.println("Safari..!!");
    }

    public void browser3() {
        System.out.println("Brave Browser");
    }
}
class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Browsers browsers = new Browsers(); // WebDriver Interface
        browsers.browser1();
        browsers.browser2();
        browsers.browser3();
    }
}