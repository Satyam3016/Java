import java.sql.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "password")) {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO employees (name, role, salary) VALUES ('Alok Sharma', 'Developer', 50000)");
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
