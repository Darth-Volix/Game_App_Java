import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 10; // Limit the number of attempts
            int guess;

            System.out.println("\nWelcome to Guess the Number!\n");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!\n");

            // Loop for the number of attempts
            for (int i = 1; i <= attempts; i++) {
                System.out.println("Attempt " + i + ": {" + (attempts - i + 1) + " attempts remaining}");
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                // Check if the guess is too low, too high, or correct
                if (guess < numberToGuess) {
                    System.out.println("\nToo low! Try again.\n");
                } else if (guess > numberToGuess) {
                    System.out.println("\nToo high! Try again.\n");
                } else {
                    System.out.println("\nCongratulations! You guessed the number in " + i + " attempts.");
                    break;
                }

                // If the player runs out of attempts
                if (i == attempts) {
                    System.out.println("Sorry! You've run out of attempts. The number was: " + numberToGuess);
                }
            }

            // Ask the player if they want to play again
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("\nThank you for playing Guess The Number! Goodbye!");
            }
        }
        scanner.close();
    }
}