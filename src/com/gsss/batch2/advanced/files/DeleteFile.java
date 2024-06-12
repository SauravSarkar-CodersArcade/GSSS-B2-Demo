package com.gsss.batch2.advanced.files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File(
                "./GSSS/Training/java.txt"
        );
        if (file.delete()){
            System.out.println("File deleted: " + file.getName());
        }else{
            System.out.println("File doesn't exists.!");
        }
    }
}
