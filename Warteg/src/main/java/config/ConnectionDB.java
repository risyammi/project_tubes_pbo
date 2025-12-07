package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/warteg";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            System.out.println("=== Mencoba koneksi database ===");
            System.out.println("URL: " + URL);
            System.out.println("User: " + USER);
            System.out.println("Password: " + (PASSWORD.isEmpty() ? "[kosong]" : "[ada]"));
            
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✓ Driver MySQL loaded");
            
            // Establish connection
            System.out.println("Mencoba koneksi...");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            if (conn != null) {
                System.out.println("✓ Database connected successfully!");
                System.out.println("Connection info: " + conn.getCatalog());
            }
            
        } catch (ClassNotFoundException e) {
            System.err.println("✗ MySQL JDBC Driver not found!");
            System.err.println("Error: " + e.getMessage());
            
            // Suggestion
            System.err.println("\nSOLUSI: Tambahkan MySQL Connector JAR ke project:");
            System.err.println("1. Download dari: https://dev.mysql.com/downloads/connector/j/");
            System.err.println("2. Pilih Platform Independent");
            System.err.println("3. Extract dan tambahkan mysql-connector-java-8.0.33.jar ke Libraries");
            
            e.printStackTrace();
            
        } catch (SQLException e) {
            System.err.println("✗ Connection failed!");
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            
            // Common errors and solutions
            if (e.getMessage().contains("Access denied")) {
                System.err.println("\nSOLUSI: Cek username/password MySQL");
                System.err.println("1. Login ke MySQL: mysql -u root -p");
                System.err.println("2. Cek user: SELECT User, Host FROM mysql.user;");
                System.err.println("3. Buat user jika perlu: CREATE USER 'root'@'localhost' IDENTIFIED BY '';");
            } else if (e.getMessage().contains("Unknown database")) {
                System.err.println("\nSOLUSI: Database 'warteg' tidak ada");
                System.err.println("1. Buat database: CREATE DATABASE warteg;");
                System.err.println("2. Atau gunakan database yang ada");
            } else if (e.getMessage().contains("Communications link failure")) {
                System.err.println("\nSOLUSI: MySQL tidak berjalan atau port salah");
                System.err.println("1. Start MySQL service");
                System.err.println("2. Cek port: netstat -an | grep 3306");
            }
            
            e.printStackTrace();
        }
        
        return conn;
    }
    
    // Test connection with GUI
    public static void main(String[] args) {
        System.out.println("=== Testing Database Connection ===");
        
        // Test koneksi
        Connection conn = ConnectionDB.getConnection();
        
        if (conn != null) {
            JOptionPane.showMessageDialog(null, 
                "Koneksi database BERHASIL!\n" +
                "Database: " + URL + "\n" +
                "Status: Connected",
                "Connection Success", 
                JOptionPane.INFORMATION_MESSAGE);
            
            try {
                conn.close();
                System.out.println("✓ Connection closed successfully!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        } else {
            JOptionPane.showMessageDialog(null, 
                "Koneksi database GAGAL!\n" +
                "Periksa:\n" +
                "1. MySQL service berjalan\n" +
                "2. Database 'warteg' ada\n" +
                "3. Username/password benar",
                "Connection Failed", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
}