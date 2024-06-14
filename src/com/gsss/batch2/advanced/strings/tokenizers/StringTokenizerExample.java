package com.gsss.batch2.advanced.strings.tokenizers;
import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args) {
        String str1 = "Java is a High Level Programming Language.";
        StringTokenizer tokenizer1 = new StringTokenizer(str1);
        while (tokenizer1.hasMoreTokens()){
            System.out.print(tokenizer1.nextToken() + " ");
        }
        System.out.println();
        String str2 = "Java,is,a,High,Level,Programming,Language.";
        StringTokenizer tokenizer2 = new StringTokenizer(str2, ",");
        while (tokenizer2.hasMoreTokens()){
            System.out.print(tokenizer2.nextToken() + " ");
        }
        System.out.println();
        String str3 = "Java$is$a$High$Level$Programming$Language.";
        StringTokenizer tokenizer3 = new StringTokenizer(str3, "$");
        while (tokenizer3.hasMoreTokens()){
            System.out.print(tokenizer3.nextToken() + " ");
        }
        System.out.println();
        String str4 = "Java,is,a,High,Level,Programming,Language.";
        String[] tokens = str4.split(",");
        for (String token : tokens){
            System.out.print(token + " ");
        }
        System.out.println();
    }
}
