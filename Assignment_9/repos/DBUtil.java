package PIJL_Assignments.Assignment_9.repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Singleton Class
public class DBUtil {

    private static Connection connection = null;
    // Private constructor for singleton class
    private DBUtil() {}

    public static Connection getConnection() throws SQLException {
        if(connection == null) {
//            String username = "<your-username>";
            String username = "<your-username>";
            String password = "<your-password>";
            String url = "jdbc:mysql://localhost:3306/<your-database>";
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}