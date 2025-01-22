package samplepro;
import java.util.regex.*;
import java.util.Scanner;
public class FormValidation {
	// creating public class FormValidation
	public static boolean Validateuser(String user) {
		// creating a boolean method for validating username.
		String userRegex="^[a-zA-Z0-9]{3,12}$";
		// here we check if the username begins with lowecase and uppercase letters
		// and the username contains numbers from 0-9
		// the length of username should be minimum 3 and max 12 characters.
		Pattern pattern=Pattern.compile(userRegex);
		// creating a pattern object of Class pattern
		//using the compile method to compile the regex pattern.
		Matcher matcher=pattern.matcher(user);
		// using the matcher method of the Matcher class to match the username.
		return matcher.matches();
		// finally checking if the input string matches the regular expression
		// the output returned is either true or false.
			
	}
	public static boolean ValidateEmail(String mail) {
		// Creating a method for Validating Email.
		String emailRegex="^[a-zA-Z0-9._+%]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		// 
		// 
		Pattern pattern=Pattern.compile(emailRegex);
		Matcher matcher=pattern.matcher(mail);
		return matcher.matches();
		
	}
	public static boolean isLeapyear(int  year) {
		if((year %4 ==0 && year %100!=0 )|| (year % 400==0)) {
			return true;
			
		}
		return false;
		
	}
	public static boolean ValidateDOB(String date) {
		String dobRegex="^([0-2][0-9](3)[0-1])/(0[1-9]1[0-2])/([0-9]{4})$";
		Pattern pattern=Pattern.compile(dobRegex);
		Matcher matcher=pattern.matcher(date);
	     if (matcher.matches()) {
	            // Extract day, month, and year from DOB
	            String[] dobParts = date.split("/");
	            int day = Integer.parseInt(dobParts[0]);
	            int month = Integer.parseInt(dobParts[1]);
	            int year = Integer.parseInt(dobParts[2]);

	            // Check for leap year and validate February
	            if (month == 2 && day == 29) {
	                if (!isLeapyear(year)) {
	                    System.out.println("Invalid DOB! February 29 is not valid in a non-leap year.");
	                    return false;
	                }
	            }
	            return true;
	        }
	        return false;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name");
		String user=sc.nextLine();
		if(Validateuser(user)) {
			System.out.println("Username is valid !");
			
		}
		else {
			System.out.println("Invalid username !");
		}
		// input for email
		System.out.println("enter the email : ");
		String mail=sc.nextLine();
		if(ValidateEmail(mail)) {
			System.out.println("Email is valid !");
		}
		else {
			System.out.println("Email is invalid !");
		}
		System.out.println("enter the date of birth (dd/mm/yyyy)");
		String date=sc.nextLine();
		if(ValidateDOB(date)) {
			System.out.println("the Date of Birth is valid !");
			
		}
		else {
			System.out.println(" The date of Birth is invalid !");
		}
		sc.close();
		
		
	}
	

}
