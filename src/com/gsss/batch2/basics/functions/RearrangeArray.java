package com.gsss.batch2.basics.functions;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,4,11,7};
        rearrangeArray(arr);
    }
    static void rearrangeArray(int[] arr){
        // Write your code here
        int[] resultantArray = new int[arr.length];
        // Odd numbers
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                resultantArray[index++] = arr[i];
            }
        }
        // Even numbers
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                resultantArray[index++] = arr[i];
            }
        }
        for (int x : resultantArray){
            System.out.print(x + " ");
        }
    }
}
