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

        // Ask the user which game they want to play first
        System.out.println("Which game would you like to play first?");
        System.out.println("1. Hangman");
        System.out.println("2. Guess the Number");
        System.out.print("Enter the number of the game you want to play: ");

        // Read the user's choice and handle input
        int gameChoice = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline to prevent input issues

        // Validate input to ensure user enters 1 or 2
        while (gameChoice != 1 && gameChoice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            System.out.print("Enter the number of the game you want to play: ");
            gameChoice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline again
        }

        // Start the selected game first, then play the other game afterward
        if (gameChoice == 1) {
            hangmanGame.startGame(scanner); // Start Hangman first
            System.out.println("\nHope you had fun playing Hangman!\nNext up is Guess the Number!");
            numberGame.startGame(scanner); // Play Number Game next
            System.out.println("\nHope you had fun playing Guess the Number!");
        } else if (gameChoice == 2) {
            numberGame.startGame(scanner); // Start Number Game first
            System.out.println("\nHope you had fun playing Guess the Number!\nNext up is Hangman!");
            hangmanGame.startGame(scanner); // Play Hangman next
            System.out.println("\nHope you had fun playing Hangman!");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
        System.out.println("\nThank you for playing the Java Game Program! Goodbye!");
    }
}