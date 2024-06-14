package com.gsss.batch2.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCInsertDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load The Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing the connection
        Connection con = DriverManager.
                getConnection(
                        "jdbc:mysql://localhost:3306/gsss",
                        "root",
                        "1234");
        String fname = "Harshitha";
        String lname = "CS";
        // Way 1
//        PreparedStatement ps = con.prepareStatement(
//                "INSERT INTO STUDENT VALUES ('BHUVANA', 'S');"
//        );
        // Way 2
//        PreparedStatement ps = con.prepareStatement(
//                "INSERT INTO STUDENT VALUES ('"+fname+"','"+lname+"');");
        // SQL INJECTION -> To avoid phishing/hacking/data leak
        // Way 3
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO STUDENT VALUES (?,?);");
        ps.setString(1, fname);
        ps.setString(2, lname);
        // Returns true if record(s) are inserted or false
        int i = ps.executeUpdate();
        if ( i > 0){
            System.out.println("Successfully inserted record.");
        }else{
            System.out.println("Failed to insert record.");
        }
        con.close();
    }
}
