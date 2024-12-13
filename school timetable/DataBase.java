package schooltimesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataBase {
    
    // Static variable to hold the database connection
    private static Connection conn = null;

    // Method to create a new connection to the database
    private static Connection createConnection() {
        try {
            // Database URL, username, and password for connecting to MySQL database
            String url = "jdbc:mysql://localhost:3306/studentdb"; 
            String username = "root";
            String password = "12345";
            
            // Attempt to establish a connection to the database
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // Show error message if connection fails
            JOptionPane.showMessageDialog(null, "Failed to connect to the database.", "Database Error", JOptionPane.ERROR_MESSAGE);
            
            // Log the exception for debugging purposes
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, e);
        }
        // Return the connection (null if failed)
        return conn;
    }

    // Public method to get the database connection (creates a new one if necessary)
    public static Connection getConnection() {
        try {
            // If the connection is not established or is closed, create a new one
            if (conn == null || conn.isClosed()) {
                conn = createConnection();
            }
        } catch (SQLException ex) {
            // Show error message if there’s a problem checking the connection status
            JOptionPane.showMessageDialog(null, "Database connection error.", "Error", JOptionPane.ERROR_MESSAGE);
            
            // Log the exception for debugging purposes
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Return the active connection
        return conn;
    }
}
