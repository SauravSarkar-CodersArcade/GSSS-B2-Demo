package com.gsss.batch2.advanced.files;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File folder = new File(
                "C:\\Users\\Saurav\\Downloads\\SeleniumForGitAndJenkins\\GSSS-B2-Java\\GSSS\\Training"
        );
        if (folder.mkdir()){
            System.out.println("Folder created: " + folder.getName());
        }else{
            System.out.println("Folder already exists.!");
        }
    }
}
