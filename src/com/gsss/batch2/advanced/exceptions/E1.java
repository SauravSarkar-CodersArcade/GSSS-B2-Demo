package com.gsss.batch2.advanced.exceptions;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[10]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error.");
        }catch (Exception e){
            System.out.println("Something unexpected happened.!!!");
        }
        finally {
            System.out.println("End of execution...!!!");
        }
        System.out.println("K is: " + k);
    }
    static {
        System.out.println("Start of execution...!!!");
    }
    {
        System.out.println("IIB 1");
    }
}
