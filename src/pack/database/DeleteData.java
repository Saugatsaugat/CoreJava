package pack.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
    static Connection con = null;
    static Statement statement = null;
    static ResultSet resultSet = null;

    public static void fetchAllData(){
        try{
            String fetchQuery = "Select * from employee";
            resultSet = statement.executeQuery(fetchQuery);

            while(resultSet.next()){
                String firstname = resultSet.getNString("firstname");
                String middlename = resultSet.getNString("middlename");
                String lastname = resultSet.getNString("lastname");
                int age = resultSet.getInt("age");

                String output = "\nFull name: " + firstname + (middlename.isEmpty()?(" "+lastname):(" "+middlename+" "+lastname) + "\nAge: "+age);
                System.out.println(output);
            }
        }catch(SQLException e){
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        try{
            con = DatabaseConnection.getDatabaseConnection();
            statement = con.createStatement();

            System.out.println("Before Delete\n");
            fetchAllData();

            String deleteQuery = "DELETE from employee" + " Where firstname='AA'";
            statement = con.createStatement();
            statement.executeUpdate(deleteQuery);
            System.out.println("Data deleted successfully");

            System.out.println("After Delete\n");
            fetchAllData();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
