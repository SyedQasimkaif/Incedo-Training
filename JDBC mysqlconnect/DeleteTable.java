package Databaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTable {

    public void delete() {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the column name to match (e.g., 'name', 'EMP_ID'):");
        String columnName = sc.nextLine();

        System.out.println("Enter the value for the column:");
        String value = sc.nextLine();

        // Validate column name (avoid SQL injection via column names)
        if (!isValidColumn(columnName)) {
            System.out.println("Invalid column name provided. Operation aborted.");
            sc.close();
            return;
        }

        // SQL query with a placeholder for the column value
        String deleteSQL = "DELETE FROM Employee1 WHERE " + columnName + " = ?";

        try (Connection connection = DatabaseConnect.getConnection();
             PreparedStatement ps = connection.prepareStatement(deleteSQL)) {

            // Set the parameter value based on input
            if (columnName.equalsIgnoreCase("EMP_ID")) {
                ps.setInt(1, Integer.parseInt(value)); // EMP_ID is numeric
            } else {
                ps.setString(1, value); // Other columns are strings
            }

            // Execute the DELETE query
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " row(s) deleted from Employee1 table.");
            } else {
                System.out.println("No rows deleted. The values may not exist, or the condition did not match any rows.");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting from table.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid value provided for EMP_ID. Please enter a numeric value.");
        } finally {
        }
    }

    // Helper method to validate column names
    private boolean isValidColumn(String columnName) {
        return columnName.equalsIgnoreCase("EMP_ID") ||
               columnName.equalsIgnoreCase("name") ||
               columnName.equalsIgnoreCase("doj") ||
               columnName.equalsIgnoreCase("role") ||
               columnName.equalsIgnoreCase("location");
    }

//    public static void main(String[] args) {
//        DeleteTable del = new DeleteTable();
//        del.delete();
//    }
}
