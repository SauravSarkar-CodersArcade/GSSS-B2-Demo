package com.gsss.batch2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
// Load The Driver
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/gsss";
        String username = "root";
        String password = "1234";
        Class.forName(driver);
        // Establishing the connection
        Connection con = DriverManager.
                getConnection(url,username,password);
        System.out.println("Connection Established");
        Statement stmt = con.createStatement();
        String createTableQuery = "CREATE TABLE EMPLOYEE_TABLE (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(50)," +
                "age INT," +
                "salary DOUBLE);";
        stmt.executeUpdate(createTableQuery);
        System.out.println("Table created successfully.");
        con.close();
    }
}
