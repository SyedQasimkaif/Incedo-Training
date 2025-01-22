package samplepro;
import java.util.*;

public class SumofNumbers {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of n numbers is"+sum);
	}

}
