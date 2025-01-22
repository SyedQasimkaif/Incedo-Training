package samplepro;
import java.util.*;
public class PalindromeOrNot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev==n) {
			System.out.println("number is palindrome");
			}
		else {
			System.out.println("number is not a palindrome");
		}
	}

}
