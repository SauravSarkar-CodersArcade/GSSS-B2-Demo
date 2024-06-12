package com.gsss.batch2.advanced.files;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) throws Exception{
        File file = new File(
                "./GSSS/Training/java.txt"
        );
        if (file.createNewFile()){
            System.out.println("File created: " + file.getName());
        }else{
            System.out.println("File already exists.!");
        }
    }
}
