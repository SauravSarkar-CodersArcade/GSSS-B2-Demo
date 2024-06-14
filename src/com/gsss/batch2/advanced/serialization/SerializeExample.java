package com.gsss.batch2.advanced.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Shravya";
        e.address = "Mysore";
        e.SSN = 3209791;
        e.number = 873214;
        try {
            FileOutputStream fileOut = new FileOutputStream(
                    System.getProperty("user.dir") +
                            "/Employee/employee.ser"
            );
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // SER
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }finally {
            System.out.println("End of execution.");
        }
    }
}
