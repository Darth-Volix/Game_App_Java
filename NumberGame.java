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
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                break;
            }

            if (i == attempts) {
                System.out.println("Sorry! You've run out of attempts. The number was: " + numberToGuess);
            }
        }

        scanner.close();
    }
}