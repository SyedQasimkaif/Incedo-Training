package samplepro;
import java.util.*;
public class Sumofdigits {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=0;
		int sum=0;
		while(n>0) {
			temp=n%10;
			n=n/10;
			sum=sum+temp;
		}
		System.out.println("the sum of the digits of the number is" +sum);
	}

}

	