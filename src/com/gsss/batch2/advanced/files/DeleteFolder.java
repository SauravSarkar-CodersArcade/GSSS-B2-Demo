package com.gsss.batch2.advanced.files;
import java.io.File;
public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File(
                "./GSSS/Training"
        );
        if (folder.delete()){
            System.out.println("Folder deleted: " + folder.getName());
        }else{
            System.out.println("Folder doesn't exist!");
        }
    }
}
