package samplepro;
import java.util.*;
public class NprimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int j=2;j<i;j++){
                if (i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
                count++;
                sum=sum+i;
                
            }
        }
        System.out.println(" the sum of prime numbers is"+sum);
        double avg=(double)sum/count;
        System.out.println(" the average of prime numbers is"+avg);

        
    } 
}
