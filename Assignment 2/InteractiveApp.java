package day2Assignments;
import java.util.*;
public class InteractiveApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String string="";
		ArrayList<String>forbiddenwords=new ArrayList<String>();
		System.out.println("Enter the number of forbidden waords");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("enter the forbidden word" + (i+1) + ":");
			String a=sc.nextLine().toLowerCase();
			forbiddenwords.add(a);	
		}
		 System.out.println("Type something then press enter, " +
	                "or type \"end\" to end the program");
		 while(!(string=sc.next()).equals("end")) {
			 if(forbiddenwords.contains(string.toLowerCase())) {
				 System.out.println("you have used a forbidden word kindly refrain from using suych words");
				 
			 }
			 else {
				 System.out.println(" you typed "+string.toUpperCase()+ "!");
				 
			 }
			 
		 }
		 System.out.println("program ended");
		 sc.close();
		
	}

}
