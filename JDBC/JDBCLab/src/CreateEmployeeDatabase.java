import java.beans.Statement;
import java.sql.DriverManager;

public class CreateEmployeeDatabase {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "";
    public static String DB_NAME = "employee_records";




    public static void main(String[] args) {
        // Establish Connection
        try {

            java.sql.Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);


            // create Statement
            java.sql.Statement statement = connection.createStatement();


            // SQL query to create database
            String sql = "CREATE DATABASE " + DB_NAME;

            // Execute queries
            statement.execute(sql);

            // print the result set
            System.out.println("Database: " + DB_NAME + " created successfully!");


            // Close references
            statement.close();
            connection.close();







        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
