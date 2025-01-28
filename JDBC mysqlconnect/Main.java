package Databaseconnection;
import java.util.Scanner;
import java.sql.Connection;
public class Main {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        // Get a connection
	        Connection connection = DatabaseConnect.getConnection();
	        boolean continueRunning=true;
	        while(continueRunning) {
	        	System.out.println("Choose an operation:");
	            System.out.println("1. Create Table");
	            System.out.println("2. Insert Values into Table");
	            System.out.println("3. Update Table");
	            System.out.println("4. Delete Record from Table");
	            System.out.println("5. Read Values from the Table");
	        	System.out.println("enter the Choice of the User");
	        	int choice=sc.nextInt();
	        	sc.nextLine();
	        	  switch(choice) {
	  	        case 1:
	  	        	 CreateTable create = new CreateTable();
	  	        	 create.createTable();
	  	        	 break;
	  	        case 2:
	  	        	InsertTable insert=new InsertTable();
	  	        	insert.insert();
	  	        	break;
	  	        case 3:
	  	        	UpdateTable update=new UpdateTable();
	  	        	update.updateTable();
	  	        	break;
	  	        case 4:
	  	        	DeleteTable del=new DeleteTable();
	  	        	del.delete();
	  	        	break;
	  	        case 5:
	  	        	 ReadTable read=new ReadTable();
	  	        	 read.Read();
	  	        	 break;
	  	        	 default:
	  	        		 System.out.println("invalid choice entered by the user ");
	  	        		 break;
	  	        	
	  	        }
	        	  System.out.println(" Do you want to continue (yes/no) ");
	        	String response=sc.nextLine();
	        	if (response.equalsIgnoreCase("no")) {
	        		continueRunning=false;
	        		
	        	}
	        	
	        }
	        sc.close();
	        System.out.println("program terminated sucessfully");
	        
	    }
}

