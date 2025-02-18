import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 10; // Limit the number of attempts
        int guess;

        System.out.println("\nWelcome to Guess the Number!\n");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!\n");

        for (int i = 1; i <= attempts; i++) {
            System.out.println("Attempt " + i + ": {" + (attempts - i + 1) + " attempts remaining}");
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("\nToo low! Try again.\n");
            } else if (guess > numberToGuess) {
                System.out.println("\nToo high! Try again.\n");
            } else {
                System.out.println("\nCongratulations! You guessed the number in " + i + " attempts.\n");
                break;
            }

            if (i == attempts) {
                System.out.println("\nSorry! You've run out of attempts. The number was: " + numberToGuess + "\n");
            }
        }

        scanner.close();
    }
}