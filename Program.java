import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Java Game Program!\n");

        System.out.println("This program will have you play two games: Hangman and Guess the Number.");
        System.out.println("Each game will allow you to play multiple times until you decide to quit.\n");
        System.out.println("Let's get started!\n");

        System.out.println("Which game would you like to play first?");
        System.out.println("1. Hangman");
        System.out.println("2. Guess the Number");
        System.out.print("Enter the number of the game you want to play: ");
        int gameChoice = scanner.nextInt();
        scanner.nextLine();

        while (gameChoice != 1 && gameChoice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            System.out.print("Enter the number of the game you want to play: ");
            gameChoice = scanner.nextInt();
            scanner.nextLine();
        }

        if (gameChoice == 1) {
            hangmanGame.startGame(scanner);
            System.out.println("\nHope you had fun playing Hangman!\nNext up is Guess the Number!");
            numberGame.startGame(scanner);
            System.out.println("\nHope you had fun playing Guess the Number!");
        } else if (gameChoice == 2) {
            numberGame.startGame(scanner);
            System.out.println("Hope you had fun playing Guess the Number!\nNext up is Hangman!");
            hangmanGame.startGame(scanner);
            System.out.println("Hope you had fun playing Hangman!");
        }

        scanner.close();
        System.out.println("\nThank you for playing the Java Game Program! Goodbye!");
    }
}