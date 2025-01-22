package samplepro;
import java.util.Scanner;
public class Floydstraingle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        int currentNumber = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }

    }
}
