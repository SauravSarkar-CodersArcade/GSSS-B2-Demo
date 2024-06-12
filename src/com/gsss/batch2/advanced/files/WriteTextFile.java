package com.gsss.batch2.advanced.files;
import java.io.FileWriter;
import java.io.IOException;
public class WriteTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter(
                "./GSSS/Training/java.txt", true
        );
        writer.append("\nSushma");
        writer.close();
    }
}
