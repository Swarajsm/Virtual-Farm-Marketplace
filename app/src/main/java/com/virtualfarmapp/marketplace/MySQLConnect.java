package com.virtualfarmapp.marketplace;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnect {
    public static void main(String[] args) {
        try {
            // Load the MySQL Connector/J driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the cPanel server
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://https://virtualfarm.app/:2083/virtua31_main?user=virtua31&password=kf5[n2AFW@z0D5");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Process the results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("fullname");
                System.out.println("id: " + id + ", name: " + name);
            }

            // Close the connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
