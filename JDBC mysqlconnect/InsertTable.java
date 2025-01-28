package Databaseconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;
public class InsertTable {

    public void insert() {
    	 Scanner sc = new Scanner(System.in); 
    	 System.out.println("Enter the Employee id ");
    	 int  emp_id= sc.nextInt();
    	 System.out.println("Enter the Employee name");
    	 sc.nextLine();
    	 String emp_name=sc.nextLine();
    	 System.out.println("Enter the Date of joining in 'YYYY-MM-DD' format ");
    	 String doj=sc.nextLine();
    	 System.out.println("Enter the Role of the Employee");
    	 String role=sc.nextLine();
    	 System.out.println("Enter the Location");
    	 String loc=sc.nextLine();
    	 String insertTableSQL = "INSERT INTO `Employee1` (`EMP_ID`, `name`, `doj`, `role`, `location`) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnect.getConnection();
             PreparedStatement ps = connection.prepareStatement(insertTableSQL)) {
        	ps.setInt(1, emp_id);
        	ps.setString(2,emp_name);
        	ps.setString(3, doj);
        	ps.setString(4, role);
        	ps.setString(5, loc);
            int rowsInserted = ps.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted successfully.");

        } catch (SQLException e) {
            // Check for duplicate entry error
            if (e.getErrorCode() == 1062) { // MySQL-specific error code for "Duplicate entry"
                System.out.println("Some or all values have already been inserted into the table.");
            } else {
                System.out.println("Error inserting values.");
                e.printStackTrace();
            }
        }
    }

//    public static void main(String[] args) {
//        InsertTable insert = new InsertTable();
//        insert.insert();
//    }
}
