package day2Assignments;
import java.util.Scanner;
import java.util.Random;
class HeadsOrTails {
    public String getHeadsOrTails() {
        Random random = new Random();
        int tossResult = random.nextInt(2);  // 0 for Heads, 1 for Tails

        return switch (tossResult) {
            case 0 -> "Heads";
            case 1 -> "Tails";
            default -> throw new IllegalStateException("Unexpected value: " + tossResult);
        };
    }
}
public class HeadsOrTailsGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HeadsOrTails game = new HeadsOrTails();

        // Ask the user to guess
        System.out.println("Welcome to the Heads or Tails game!");
        System.out.print("Guess the outcome (Heads/Tails): ");
        String userGuess = scanner.nextLine().trim();

        // Validate the user input
        if (!userGuess.equalsIgnoreCase("Heads") && !userGuess.equalsIgnoreCase("Tails")) {
            System.out.println("Invalid input! Please enter either 'Heads' or 'Tails'.");
            return;
        }

        // Get the result of the toss
        String tossResult = game.getHeadsOrTails();
        System.out.println("The coin toss result is: " + tossResult);

        // Check if the user won
        if (userGuess.equalsIgnoreCase(tossResult)) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry! You lost. Better luck next time.");
        }

        scanner.close();
    }
}

