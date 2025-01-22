package samplepro;
import java.lang.*;
public class Armstrongfrom1to100 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int sum=0;
            int temp=i;
            int digit=0;
            while(temp>0){
                digit=digit+1;
                temp=temp/10;
            }
            temp=i;
            while(temp>0){
                int rem=temp%10;
                sum=sum+(int)Math.pow(rem,digit);
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
