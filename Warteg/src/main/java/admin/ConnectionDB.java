package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/warteg";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            if (conn != null) {
                System.out.println("Database connected successfully!");
            }
            
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection failed! Check URL, username, and password.");
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        return conn;
    }
    
    // Test connection
    public static void main(String[] args) {
        System.out.println("Testing database connection...");
        Connection conn = ConnectionDB.getConnection();
        
        if (conn != null) {
            System.out.println("Connection successful!");
            try {
                conn.close();
                System.out.println("Connection closed successfully!");
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        } else {
            System.out.println("Connection failed!");
        }
    }
}
