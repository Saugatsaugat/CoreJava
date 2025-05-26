package pack.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection con = null;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded MySQL JDBC");

            String host = "localhost";
            String db = "employee_db";
            int port = 3306;
            String user = "saugat";
            String password = "";

            String jdbcUrl = "jdbc:mysql://"+host+":"+port+"/"+db;
            con = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection Established");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
