package com.gsss.batch2.advanced.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {
    public static void main(String[] args) {
        Employee e;
        try {
            FileInputStream fileIn = new FileInputStream(
                    System.getProperty("user.dir") +
                            "/Employee/employee.ser"
            );
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject(); // Type Casting
            in.close();
            fileIn.close();
        }catch (IOException i){
            i.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c){
            System.out.println("Employee Class Not Found.!");{
                c.printStackTrace();
                return;
            }
        }
        System.out.println("The deserialized employee details are: ");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
