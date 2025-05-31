package pack.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    static Connection con = null;
    static Statement statement = null;
    static ResultSet resultSet = null;

    public static void main(String[] args) throws SQLException {
        con = DatabaseConnection.getDatabaseConnection();
        try {
            String insertData = "INSERT INTO employee_db.employee(firstname, middlename, lastname, age) VALUES('Saugat', ' ', 'DEVP', 23)";
            statement = con.createStatement();
            statement.executeUpdate(insertData);
            System.out.println("Data inserted successfully");

            // fetch
            String selectQuery = "SELECT * from employee;";
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                String fullname = resultSet.getNString("firstname") + (resultSet.getNString("middlename").isEmpty() ? " " + resultSet.getNString("lastname") : (resultSet.getNString("middlename") + " " + resultSet.getNString("lastname")));
                int age = resultSet.getInt("age");
                System.out.println("\nFullname: " + fullname + "\nAge: " + age);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
