package day2Assignments;
import java.util.*;
public class SimplCalc2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean continueRunning = true;
		while(continueRunning) {
			SimpleCalc calc= new SimpleCalc();
			System.out.println("Enter the choice of the user :");
			int choice=sc.nextInt();
			double result=0;
			switch(choice) {
			case 1:
				result=calc.addNum(a,b);
				System.out.println(result);
				break;
			case 2:
				result=calc.subtractNum(a,b);
				System.out.println(result);
				break;
			case 3:
				result=calc.MultiplyNum(a, b);
				System.out.println(result);
				break;
			case 4:
				result=calc.DivideNum(a,b);
				System.out.println(result);
				break;
			case 5:
				result=calc.remainderNum(a, b);
				System.out.println(result);
				break;
			case 6:
				result=calc.MaxNum(a,b);
				System.out.println(result);
				break;
			case 7:
				result=calc.MinNum(a, b);
				System.out.println(result);
				break;
			case 8:
				result=calc.AverageNum(a, b);
				System.out.println(result);
				default:
					System.out.println(" invalid choice !");
				
			}
			// Ask if the user wants to continue
	        System.out.print("Do you want to perform another calculation? (yes/no): ");
	        String userResponse = sc.next();
	        if (userResponse.equalsIgnoreCase("no")) {
	            continueRunning = false;
	        }
	        
		}
		System.out.println("Thank you for using the calculator!");
	    sc.close();
		
		
	}
}
