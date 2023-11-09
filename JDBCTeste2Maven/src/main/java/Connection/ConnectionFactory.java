package Connection;

import java.sql.*;

public class ConnectionFactory {
 private static final String URL = "jdbc:postgres://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
