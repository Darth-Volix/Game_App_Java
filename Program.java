import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Create instances of the Hangman and Number Game classes
        HangmanGame hangmanGame = new HangmanGame();
        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Display welcome message
        System.out.println("\nWelcome to the Java Game Program!\n");

        // Brief introduction to the games
        System.out.println("This program will have you play two games: Hangman and Guess the Number.");
        System.out.println("Each game will allow you to play multiple times until you decide to quit.\n");
        System.out.println("Let's get started!\n");

        // Start Hangman first
        System.out.println("First, you'll play Hangman!");
        hangmanGame.startGame(scanner);
        System.out.println("\nHope you had fun playing Hangman!\nNext up is Guess the Number!");

        // Play Number Game next
        numberGame.startGame(scanner);
        System.out.println("\nHope you had fun playing Guess the Number!");

        // Close the scanner to prevent resource leak
        scanner.close();
        System.out.println("\nThank you for playing the Java Game Program! Goodbye!");
    }
}