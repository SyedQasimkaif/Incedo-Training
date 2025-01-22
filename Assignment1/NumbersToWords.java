package samplepro;
import java.util.Scanner;
public class NumbersToWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String output="";
        String []words={"Zero","one","two","three","four","five","six","seven","eight","nine"};
        int temp=n;
        while(temp>0){
        output=words[temp%10]+" "+output;
        temp=temp/10;

        
    }
    System.out.println(output);

        
    }
    


    }



    

