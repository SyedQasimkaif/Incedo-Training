package samplepro;

public class Oddnumbercount {
	public static void main(String args[]) {
		int count=0;
		for(int i=1;i<100;i++) {
			if(i%2!=0) {
				count=count+1;
			}
		}
		System.out.println(" the total number of odd numbers b/w 1 to 100 is "+count);
	}
}
