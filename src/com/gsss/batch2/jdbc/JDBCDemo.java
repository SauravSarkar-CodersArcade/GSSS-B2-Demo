package com.gsss.batch2.jdbc;
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        // Load The Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing the connection
        Connection con = DriverManager.
                getConnection(
                        "jdbc:mysql://localhost:3306/gsss",
                        "root",
                        "1234");
        // Create a Statement Object
        Statement stmt = con.createStatement();
        // Execute the query & Store the result
        ResultSet rs = stmt.executeQuery(
                "SELECT * FROM STUDENT");
        // Traverse the record and print the data if any
        while (rs.next()){
            System.out.println(
                    rs.getString(1) + "\t" +
                    rs.getString(2));
        }
        // Close all the resources
        rs.close();
        stmt.close();
        con.close();
    }
}
