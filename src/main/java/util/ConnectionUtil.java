package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
//    private static final String URL = "jdbc:mysql://localhost:3306/lesson";
//    private static final String USER = "root";
//    private static final String PASS = "3245";
//
//
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(URL, USER, PASS);
//    }
//}

    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "3245";
    private static final String URL
            = "jdbc:mysql://localhost:3306/lesson?serverTimezone=UTC";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find MySQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.put("user", DB_USER);
        dbProperties.put("password", DB_PASSWORD);
        String url = URL;

        try {
            return DriverManager.getConnection(url, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}