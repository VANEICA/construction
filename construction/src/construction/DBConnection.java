package construction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/constructionmanagemen1t", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
    Connection conn = DBConnection.getConnection();
    if (conn != null) {
        System.out.println("Connected to database successfully!");
    } else {
        System.out.println("Failed to connect to the database.");
    }
}

}
