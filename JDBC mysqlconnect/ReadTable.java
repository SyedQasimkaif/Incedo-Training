package Databaseconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class ReadTable {
    public void Read() {
        String readSQL = "SELECT * FROM Employee1";

        try (Connection connection = DatabaseConnect.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(readSQL)) {

            // Print header
            System.out.printf("%-10s | %-15s | %-15s | %-20s | %-15s%n", 
                "EMP_ID", "Name", "Date of Joining", "Role", "Location");
            System.out.println("---------------------------------------------------------------------");

            // Iterate and print rows
            while (resultSet.next()) {
                int id = resultSet.getInt("EMP_ID");
                String name = resultSet.getString("name");
                String doj = resultSet.getDate("doj").toString();
                String role = resultSet.getString("Role");
                String loc = resultSet.getString("Location");

                System.out.printf("%-10d | %-15s | %-15s | %-20s | %-15s%n", 
                    id, name, doj, role, loc);
            }

        } catch (SQLException e) {
            System.out.println("Error reading data!");
            e.printStackTrace();
        }
    }
}
