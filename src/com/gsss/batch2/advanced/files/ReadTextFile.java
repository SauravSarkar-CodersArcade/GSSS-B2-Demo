package com.gsss.batch2.advanced.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./GSSS/Training/java.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()){
            String data = reader.next();
            System.out.print(data + " ");
        }
        reader.close();
    }
}
