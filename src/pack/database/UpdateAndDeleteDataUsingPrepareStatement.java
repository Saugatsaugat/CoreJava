package pack.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateAndDeleteDataUsingPrepareStatement {
    static Connection con = null;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws SQLException {
        con = DatabaseConnection.getDatabaseConnection();
        try{
            String updateQuery = "Update employee set middlename=? where firstname=?";
            preparedStatement = con.prepareStatement(updateQuery);
            preparedStatement.setString(1, "null");
            preparedStatement.setString(2, "Ram");
            preparedStatement.executeUpdate();
            System.out.println("Data updated successfully");
            System.out.println("\nBefore Delete\n");
            DatabaseConnection.fetchAllData();

            String deleteQuery = "Delete from employee where firstname=?";
            preparedStatement = con.prepareStatement(deleteQuery);
            preparedStatement.setString(1, "Ram");
            preparedStatement.executeUpdate();
            System.out.println("\nAfter Delete\n");
            DatabaseConnection.fetchAllData();


        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
