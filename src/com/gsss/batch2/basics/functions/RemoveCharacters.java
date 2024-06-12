package com.gsss.batch2.basics.functions;
public class RemoveCharacters {
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        char ch = 'A';
        removeChar(str, ch);
    }
    static void removeChar(String str, char ch){
        String finalStr = "";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) != ch){
                finalStr += str.charAt(i);
            }
        }
        System.out.println(finalStr);
    }
}
