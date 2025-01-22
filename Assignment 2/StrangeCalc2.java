package day2Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class StrangeCalc2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		StrangeCalc calc=new StrangeCalc(Arrays.asList(10.0,5.0,3.0,2.0,1.0));
		boolean isRunning=true;
		while(isRunning) {
			System.out.println("enter the choice of the user");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(calc.sum());
				break;
			case 2:
				System.out.println(calc.subtract());
				break;
			case 3:
				System.out.println(calc.multiply());
				break;
			case 4:
				System.out.println(calc.divide());
				break;
			case 5:
				System.out.println(calc.remainder());
				break;
			case 6:
				System.out.println(calc.largest());
				break;
			case 7:
				System.out.println(calc.smallest());
				break;
			case 8:
				System.out.println(calc.average());
				default:
					System.out.println("invalid choice");
			}
			System.out.print("Do you want to perform another calculation? (yes/no): ");
		        String userResponse = sc.next();
		        if (userResponse.equalsIgnoreCase("no")) {
		            isRunning = false;
		        }
		}
		System.out.println("Thank you for using the calculator:");
}
}
