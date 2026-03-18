package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {

        try {
            String url = "jdbc:mysql://localhost:3306/payroll_db?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String password = "Yuvi@2005";

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Database Connected");
            return con;

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return null;
        }
    }
}