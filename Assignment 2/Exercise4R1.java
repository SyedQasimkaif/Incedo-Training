package day2Assignments;

import java.util.Scanner;

public class Exercise4R1 {
	private static int  matrix[][]= {
			{1, 7, 3, 9, 5, 3},
			{6, 2, 3},
			 {7, 5, 1, 4, 0},
			 {1, 0, 2, 9, 6, 3, 7, 8, 4}
			};
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		if(args.length==0) {
			System.out.println("No number provided");
			System.out.println("provide an Integer between 0-9 as command line argument");
			return;
		}
		try {
			int n=Integer.parseInt(args[0]);
			if(n<0 || n>9) {
				System.out.println("Number out of range");
				System.out.println("provide an integer between 0 and 9 as command line argument");
				return;
			}
			for(int rows=0;rows< matrix.length;rows++) {
				for(int columns=0;columns<matrix[rows].length;columns++) {
					if(matrix[rows][columns]==n) {
						System.out.println(" the first occurences found at row" + rows+ "columns " +columns);
						return;	
					}
					
				}
			}
			System.out.println("Number"+ n + " not found in the matrix.");
		} catch (NumberFormatException e) {
			System.out.println("Error invalid input. Please provide an integer.");
			System.out.println("provide an integer between 0 and 9 as command-line argument");
		}
		sc.close();
		
	}
}

