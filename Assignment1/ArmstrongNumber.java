package samplepro;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		int total = 0;
		while (temp>0) {
			total=total+1;
			temp=n/10;
		}
		temp=n;
		while(temp>0) {
			temp=temp/10;
			sum=sum+(int)Math.pow(temp%10, total);
		}
		if(sum==n) {
			System.out.println("The given number is Armstrong");
		}
		else {
			System.out.println("The given number is not Armstrong");
		}
		
	}
	
}
