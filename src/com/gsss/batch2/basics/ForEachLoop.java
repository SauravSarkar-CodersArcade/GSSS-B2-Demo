package com.gsss.batch2.basics;
public class ForEachLoop {
    public static void main(String[] args) {
        char[][] letters = {
                {'e','d','u','c','a','t','i','o','n'},
                {'c','a','u','l','i','f','l','o','w','e','r'}
        };
        // Traditional Way
        for (int r=0; r< letters.length; r++){ // No of ele
            for (int c=0; c<letters[r].length; c++){ // row[length]
                System.out.print(letters[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(letters.length);
        for (char[] chArray : letters){
            for (char ch : chArray){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
