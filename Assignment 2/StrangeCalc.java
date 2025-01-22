package day2Assignments;
import java.util.*;
public class StrangeCalc {
	private List<Double>numbers;
	public StrangeCalc(List<Double>numbers) {
		this.numbers=numbers;
		
	}
	public double sum() {
		double total=0;
		for(double num:numbers) {
			total=total+num;
		}
		return total;
	}
	public double subtract() {
		if (numbers.size()<2) {
			System.out.println("Subtraction cannot be performed");
		}
		double result=numbers.get(0);
		for(int i=0;i<numbers.size();i++) {
			result=result- numbers.get(i);
		}
		return result;
	}
	public double multiply() {
		double result=1;
		for(double num:numbers) {
			result=result*num;
		}
		return result;
	}
	public double divide() {
		if(numbers.size()<2) {
			System.out.println("Division cannot be performed");
		}
		double result=numbers.get(0);
		for(int i=1;i<numbers.size();i++) {
			if(numbers.get(i)==0) {
				System.out.println("divison by zero not possible");
			}
			result=result/numbers.get(i);
		}
		return result;
	}
	public double remainder() {
		if(numbers.size()<2) {
			System.out.println("Remainder cannot be found");
		}
		double result=numbers.get(0);
		for(int i=1;i<numbers.size();i++) {
			if(numbers.get(i)==0) {
				System.out.println("divison by zero Not possible");
			}
			result=result%numbers.get(i);
		}
		return result;
	}
	public double largest() {
		
		if(numbers.size()==1) {
			return numbers.get(0);
		}
		double max=numbers.get(0);
			for(int i=0;i<numbers.size();i++) {
				if(numbers.get(i)>max) {
					max=numbers.get(i);
					
				}
			}
			return max;
		}
	public double smallest() {
		if(numbers.size()==1) {
			return numbers.get(0);
		}
		double min=numbers.get(0);
		for(int i=0;i<numbers.size();i++) {
			if(numbers.get(i)<min) {
				min=numbers.get(i);
			}
		}
		return min;
	}
	public double average() {
		double avg=numbers.get(0);
		double sum=0;
		for(int i=0;i<numbers.size();i++) {
			sum=sum+numbers.get(i);
			
		}
		avg=sum/numbers.size();
		return avg;
	}
	public static void main(String args[]) {
		StrangeCalc calc=new StrangeCalc(Arrays.asList(1.0,2.0,3.0,4.0));
		System.out.println(calc.sum());
		System.out.println(calc.subtract());
		System.out.println(calc.multiply());
		System.out.println(calc.divide());
		System.out.println(calc.remainder());
		System.out.println(calc.largest());
		System.out.println(calc.smallest());
		System.out.println(calc.average());
		
		
	}
	
}

