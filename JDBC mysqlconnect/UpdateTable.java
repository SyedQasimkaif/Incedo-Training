package Databaseconnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.*;
public class UpdateTable {

    public void updateTable() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the column to be updated ");
    	String ColumnUpdate =sc.nextLine();
    	System.out.println("enter a new Value for the column");
    	String newValue=sc.nextLine();
    	System.out.println("Enter the column Name to be matched");
    	String matchedColumn=sc.nextLine();
    	System.out.println("Enter the value of the condition column");
    	String matchedValue=sc.nextLine();
    	if(!isValid(ColumnUpdate) || !isValid(matchedColumn)) {
    		System.out.println("invalid column name provided");
    		sc.close();
    		return;
    	}
    	String updateTableSQL = "UPDATE Employee1 SET " + ColumnUpdate + " = ? WHERE " + matchedColumn + " = ?";
    	
        

        try (Connection connection = DatabaseConnect.getConnection();
        		PreparedStatement ps = connection.prepareStatement(updateTableSQL)) {
        	 	ps.setString(1, newValue);
        	 	if(matchedColumn.equalsIgnoreCase("EMP_ID")) {
        	 		ps.setInt(2, Integer.parseInt(matchedValue));
        	 	}
        	 	else {
        	 		ps.setString(2, matchedValue);
        	 	}

            // Execute the update statement
            int rowsUpdated = ps.executeUpdate();

            // Check the number of rows updated
            if (rowsUpdated > 0) {
                System.out.println("Rows " + rowsUpdated + " updated in Employee1 table.");
            } else {
                System.out.println("No rows updated. The values may have already been updated or the condition did not match any rows.");
            }

        } catch (SQLException e) {
            System.out.println("Error updating table.");
            e.printStackTrace();
        }
    }
    private boolean isValid(String ColumnName) {
    	return ColumnName.equalsIgnoreCase("EMP_ID") ||
    			ColumnName.equalsIgnoreCase("name")||
    			ColumnName.equalsIgnoreCase("doj")||
    			ColumnName.equalsIgnoreCase("Role")||
    			ColumnName.equalsIgnoreCase("Location");
    	
    	
    }
//    public static void main(String[] args) {
//        UpdateTable update = new UpdateTable();
//        update.updateTable();
//    }
}
