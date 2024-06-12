package com.gsss.batch2.advanced.oops.pillars.polymorphism;

public class ReserveBankOfIndia {
    double rateOfInterest(){
        return 6.5;
    }
}
class ICICI extends ReserveBankOfIndia{
    double rateOfInterest(){
        return 7.5;
    }
}
class SBI extends ReserveBankOfIndia{
    double rateOfInterest(){
        return 7.3;
    }
}
class HDFC extends ReserveBankOfIndia{
    double rateOfInterest(){
        return 8.1;
    }
}
class Banking {
    public static void main(String[] args) {
        ReserveBankOfIndia rbi = new ReserveBankOfIndia();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        SBI sbi = new SBI();
        System.out.println("RBI " + rbi.rateOfInterest() + "%");
        System.out.println("ICICI " + icici.rateOfInterest() + "%");
        System.out.println("SBI " + sbi.rateOfInterest() + "%");
        System.out.println("HDFC " + hdfc.rateOfInterest() + "%");
    }
}
