package com.gsss.batch2.interviewQuetions;

import java.util.Arrays;

public class MissingElement {
    static int missingElement(int[] arr){
        int n = arr.length + 1;
        int sum = 3*(n * (n+1)/2);
        for (int i=0; i<n-1; i++){
            sum -= arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,12,18,9,24,21,27,30};
        int mEle = missingElement(arr);
        System.out.println("arr" + Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0,
                arr.length);
        System.out.println("arr2" + Arrays.toString(arr2));
        System.out.println("Missing element is: " + mEle);
    }
}
