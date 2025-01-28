package Databaseconnection;

	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectAllExample {
      public static void main(String[] args) {
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "Incedo@1234";

            // JDBC objects
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                // Load the JDBC driver (optional for modern versions)
                Class.forName("com.mysql.cj.jdbc.Driver"); // For MySQL. Adjust for your DB.

                // Connect to the database
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the database!");

                // Create a statement
                statement = connection.createStatement();
                String CreateTable="CREATE TABLE employees1 ("
                		+ "id int PRIMARY KEY "
                		+ " name VARCHAR(20) "
                		+ " Dateofjoining  DATE NOT NULL "
                		+ " location VARCHAR(20)";
                // Execute INSERT query
                String insertSQL = "INSERT INTO employees (Employee_id, Employee_name,DateOFJoining,location,phone_no) "
                					+ "VALUES(611345,'Joy','2025-01-08','HYD',978654329),"
                					+ "(611346,'Jane','2025-01-09','HYD',987012347),"
                					+"(611347,'Smith','2025-01-10','CHN',912345054)";
                int rowsinserted=statement.executeUpdate(insertSQL);
                System.out.println(rowsinserted + " rows inserted sucessfuly");
              // Execute the SELECT query
                
                String query = "SELECT * FROM  employees";
                resultSet = statement.executeQuery(query);

                // Get metadata for column names
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Display column names
                System.out.println("Results:");
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + "\t");
                }
                System.out.println();

                // Display rows
                while (resultSet.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(resultSet.getString(i) + "\t");
                    }
                    System.out.println();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close resources
                try {
                    if (resultSet != null) resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }



