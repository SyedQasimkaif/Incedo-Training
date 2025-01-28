package Databaseconnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {
    public void createTable() {
        String createTableSQL = "CREATE TABLE Employee1 ( "
                + "EMP_ID INT PRIMARY KEY, "
                + "name VARCHAR(20) NOT NULL, "
                + "doj VARCHAR(20) NOT NULL, "
                + "role VARCHAR(20) NOT NULL, "
                + "location VARCHAR(20) "
                + ")";

        try (Connection connection = DatabaseConnect.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully!");

        } catch (SQLException e) {
            // Check if the table already exists
            if (e.getErrorCode() == 1050) { // MySQL-specific error code for "Table already exists"
                System.out.println("Table already exists.");
            } else {
                System.out.println("Error creating table.");
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        CreateTable create = new CreateTable();
//        create.createTable();
//        InsertTable insert = new InsertTable();
//        insert.insert();
//    }
}
