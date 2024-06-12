package com.gsss.batch2.advanced.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FoldersWithFilesAndText {
    public static void main(String[] args) throws IOException {
        String[] studentNames = {
           "Shravya",
           "Sushma",
           "Chinmayi",
           "Bhuvana"
        } ;
        String[] courseName = {
                "Python",
                "Java",
                "SQl",
                "JavaScript"
        };
        String[] projectName = {
                "Machine Learning",
                "API",
                "Hospital management DB",
                "Front End Application"
        };
        String path = "./Folder/";
        for (int i=0; i<studentNames.length; i++){
            String folderName = studentNames[i];
            File folder = new File(path + folderName);
            if (folder.mkdir()){
                System.out.println(
                        "Folder " + folder.getName() + " created."
                );
            }
            else{
                System.out.println("Failed to create folder.");
            }
            String fileName = courseName[i];
            // -> (./Folder/Shravya/Python.txt)
            File file = new File(path + folderName
            + "/" + fileName + ".txt");
            if (file.createNewFile()){
                System.out.println(
                        "File" + file.getName() + " created.");
            }else{
                System.out.println("Failed to create the file.");
            }
            String data = projectName[i];
            FileWriter writer = new FileWriter(
                    path + folderName
                            + "/" + fileName + ".txt"
            );
            writer.append("\n").append(data);
            System.out.println("Wrote successfully to the file.");
            writer.close();
        }

    }
}
