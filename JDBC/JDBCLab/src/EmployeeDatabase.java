import java.sql.*;
import java.util.Scanner;

public class EmployeeDatabase {
    static final String DB_URL = "jdbc:mysql://localhost:3306/employee_records";
    static final String USER = "root"; // change as per your MySQL user
    static final String PASS = "";     // change as per your MySQL password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            while (true) {
                System.out.println("\n--- Employee Records Menu ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Update Employee Salary");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Position: ");
                        String position = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        addEmployee(conn, name, position, salary);
                        renumberEmployeeIds(conn);
                        break;
                    case 2:
                        viewEmployees(conn);
                        break;
                    case 3:
                        System.out.print("Enter Employee ID to update salary: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter new Salary: ");
                        double newSalary = scanner.nextDouble();
                        updateEmployeeSalary(conn, updateId, newSalary);
                        break;
                    case 4:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteEmployee(conn, deleteId);
                        renumberEmployeeIds(conn);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee(Connection conn, String name, String position, double salary) throws SQLException {
        String query = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, position);
            stmt.setDouble(3, salary);
            stmt.executeUpdate();
            System.out.println("Employee added successfully.");
        }
    }

    static void viewEmployees(Connection conn) throws SQLException {
        String query = "SELECT * FROM employees";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("\nID | Name | Position | Salary");
            System.out.println("---------------------------------------");
            while (rs.next()) {
                System.out.printf("%d | %s | %s | %.2f\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("position"),
                        rs.getDouble("salary"));
            }
        }
    }

    static void updateEmployeeSalary(Connection conn, int id, double newSalary) throws SQLException {
        String query = "UPDATE employees SET salary = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, newSalary);
            stmt.setInt(2, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Salary updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    static void deleteEmployee(Connection conn, int id) throws SQLException {
        String query = "DELETE FROM employees WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    static void renumberEmployeeIds(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            // Step 1: Reset IDs from 1 to N
            stmt.execute("SET @count = 0");
            stmt.executeUpdate("UPDATE employees SET id = (@count := @count + 1)");

            // Step 2: Reset AUTO_INCREMENT value
            stmt.execute("ALTER TABLE employees AUTO_INCREMENT = 1");
        }
    }
}
