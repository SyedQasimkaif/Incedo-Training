package samplepro;
import java.util.Scanner;
public class PalindromeuptoN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int rev=0;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
                if(rev==i){
                    System.out.println(i);
                }
            } 
        }
        
    }   
}
