package samplepro;
import java.util.Scanner;
public class Starpattern {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Take the number of rows (n) as input
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

