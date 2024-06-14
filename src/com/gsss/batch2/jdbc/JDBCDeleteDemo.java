package com.gsss.batch2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDeleteDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load The Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establishing the connection
        Connection con = DriverManager.
                getConnection(
                        "jdbc:mysql://localhost:3306/gsss",
                        "root",
                        "1234");
        String fname = "Sanjana";

        PreparedStatement ps = con.prepareStatement(
                "DELETE FROM STUDENT WHERE fname=?");
        ps.setString(1,fname);
        // Returns true if record(s) are inserted or false
        int i = ps.executeUpdate();
        if ( i > 0){
            System.out.println("Successfully deleted record.");
        }else{
            System.out.println("Failed to delete record.");
        }
        con.close();
    }
}
