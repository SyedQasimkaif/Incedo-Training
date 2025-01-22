
/*
 * Declare a SimpleCalc class that given two numbers, defines the methods for: 
• Summing them. 
• Subtract the second from the first. 
• Multiply. 
• Divide them. 
• Return the rest of the division. 
• Return the largest number (the maximum). 
• Return the smallest number (the minimum). 
• Return the average of the two numbers Create a class that tests all methods.
 */

package day2Assignments;
import java.util.*;
public class SimpleCalc {
	public double addNum(int a ,int b) {
		return a+b;
	}
	public double subtractNum(int a,int b) {
		return a-b;
	}
	public double MultiplyNum(int a, int b) {
		return a*b;
	}
	public double DivideNum(int a, int b){
		if(b!=0) {
			return a/b;
		}
		else {
			System.out.println("inavlid divison");
			return -1;
		}
		
	}
	public double remainderNum(int a ,int b) {
		if(b!=0) {
			return a%b;
		}
		else {
			System.out.println("inavalid division");
			return -1;
		}
		
	}
	public double MaxNum(int a, int b) {
		return Math.max(a, b);
	}
	public double MinNum(int a, int b) {
		return Math.min(a, b);
	}
	public double AverageNum(float a, float b) {
		return (a+b)/2;
	}
	public static void main(String args[]) {
		SimpleCalc calc=new SimpleCalc();
		System.out.println(calc.addNum(5, 6));
		System.out.println(calc.subtractNum(5, 6));
		System.out.println(calc.MultiplyNum(5, 6));
		System.out.println(calc.DivideNum(5, 6));
		System.out.println(calc.remainderNum(5, 6));
		System.out.println(calc.MaxNum(5, 6));
		System.out.println(calc.MinNum(5, 6));
		System.out.println(calc.AverageNum(5, 6));
		
		
	}
}
		
		




