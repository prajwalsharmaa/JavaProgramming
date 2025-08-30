import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/db_nepathya_college";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "";

    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

            // Create Statement
            Statement statement = connection.createStatement();

            //SQL query to insert data
            String sqlQuery = """
    INSERT INTO users (id, name, email) VALUES
    (1, 'Alice', 'alice@gmail.com'),
    (2, 'Alina', 'alina@gmail.com')
    """;

            // Execute the query
            statement.executeUpdate(sqlQuery);
            System.out.println("Table 'users' created successfully.");

            // Close resources
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
