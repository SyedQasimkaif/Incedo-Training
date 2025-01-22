/*  Given the following class:
public class Exercise4R {
 private static int matrix[][] = {
 {1, 7, 3, 9, 5, 3},
{6, 2, 3},
 {7, 5, 1, 4, 0},
 {1, 0, 2, 9, 6, 3, 7, 8, 4}
};
public static void main(String args[]) {
 }
}
implement the main() method so that it reads a number (between 0 and 9) as parameter
args[0], and find the position (row and column) of the first occurrence of the number specified 
within the two-dimensional array called matrix
*/
package day2Assignments;
import java.util.*;
public class Exercise4R {
	private static int  matrix[][]= {
			{1, 7, 3, 9, 5, 3},
			{6, 2, 3},
			 {7, 5, 1, 4, 0},
			 {1, 0, 2, 9, 6, 3, 7, 8, 4}
			};
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		if(args.length==0) {
			System.out.println("the argument provided is empty kindly provide an element to check.");
			return;
		}
		int n=Integer.parseInt(args[0]);
			for(int rows=0;rows< matrix.length;rows++) {
				for(int columns=0;columns<matrix[rows].length;columns++) {
					if(matrix[rows][columns]==n) {
						System.out.println(" the first occurences found at row" + rows+ "columns " +columns);
						return;
						
					}
					
				}
			}
			System.out.println("invalid input from the user");
		
		
	}

}
