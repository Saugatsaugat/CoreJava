package pack.database;

import java.sql.*;

public class DatabaseConnection {
    static Connection con = null;
    static Statement statement = null;
    static ResultSet resultSet = null;

    public static Connection getDatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Loaded MySQL JDBC");

            String host = "localhost";
            String db = "employee_db";
            int port = 3306;
            String user = "saugat";
            String password = "";

            String jdbcUrl = "jdbc:mysql://" + host + ":" + port + "/" + db;
            con = DriverManager.getConnection(jdbcUrl, user, password);
            System.out.println("Connection Established");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public static void fetchAllData(){
        Statement statement = null;
        Connection con = null;
        try{
            con = getDatabaseConnection();
            statement = con.createStatement();
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
}
