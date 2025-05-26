package pack.database;

import java.sql.*;

public class InsertDataUsingPrepareStatement {
    static Connection con = null;
    static PreparedStatement preparedStatement = null;

    public static void main(String[] args) throws SQLException {
        con = DatabaseConnection.getDatabaseConnection();
        try{
            String insertQuery = "INSERT INTO employee values" + " (?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(insertQuery);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, "Ram");
            preparedStatement.setString(3, " ");
            preparedStatement.setString(4, "Thapa");
            preparedStatement.setInt(5, 25);
            preparedStatement.executeUpdate();

            DatabaseConnection.fetchAllData();

        }catch(SQLException e){
            e.printStackTrace();
        }

    }


}
