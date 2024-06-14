package com.gsss.batch2.advanced.patternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(
                "Kamakshi",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(
                "KAMAKSHI is from Mysore");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Correct Match.");
        }else {
            System.out.println("Data Mismatch.");
        }
    }
}
