package com.gsss.batch2.advanced.strings;
import java.util.Arrays;
public class StringsInJava {
    public static void main(String[] args) {
        char[] letters = {'K','A','M','A','K','S','H','I'};
        // How to convert a chat array into a string ?
        String name = new String(letters);
        int a = 10;
        Integer x = 20; // Wrapper Classes
        System.out.println(name); // KAMAKSHI
        String word = "Kamakshi1is1from1Batch2";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.indexOf('a'));
        String[] words = word.split("1");
        System.out.println(Arrays.toString(words));
        String data = "     Java Programming     ";
        System.out.println(data.trim());
    }
}
