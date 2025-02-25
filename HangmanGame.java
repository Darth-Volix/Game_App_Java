import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class HangmanGame {
    public void startGame(Scanner scanner) {
        Random random = new Random();
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            String[] words = {
                    "temple", "mosiah", "nephi", "lehi", "mormon", "ammon",
                    "alma", "ether", "mosiah", "laman", "coriantumr", "moroni",
                    "benjamin", "abish", "heli", "sariah", "teancum",
                    "helaman", "shiz", "sam", "zarahemla", "gideon", "laban", "zenniff",
                    "pahoran", "nephi", "jacob", "ammonihah", "akish", "shimnon", "mulek"
            };
            String word = words[random.nextInt(words.length)];
            Set<Character> correctGuesses = new HashSet<>();
            Set<Character> incorrectGuesses = new HashSet<>();
            int maxAttempts = 6; // Number of incorrect guesses before losing
            int remainingAttempts = maxAttempts;

            System.out.println("\nWelcome to Hangman!\n");

            // Give the user instructions
            System.out.println("I have selected a word from the Book of Mormon.\nTry to guess it within 6 tries!\n");

            // Game loop
            while (remainingAttempts > 0) {
                System.out.print("Current word: ");
                for (int i = 0; i < word.length(); i++) {
                    if (correctGuesses.contains(word.charAt(i))) {
                        System.out.print(word.charAt(i) + " ");
                    } else {
                        System.out.print("_ ");
                    }
                }

                System.out.println("\nIncorrect guesses: " + incorrectGuesses);
                System.out.println("Remaining attempts: " + remainingAttempts + "\n");

                System.out.print("Guess a letter: ");
                char guess = scanner.nextLine().toLowerCase().charAt(0);

                if (correctGuesses.contains(guess) || incorrectGuesses.contains(guess)) {
                    System.out.println("You already guessed that letter. Try again.");
                } else if (word.indexOf(guess) >= 0) {
                    correctGuesses.add(guess);
                    System.out.println("Good guess!");
                } else {
                    incorrectGuesses.add(guess);
                    remainingAttempts--;
                    System.out.println("Incorrect guess.");
                }

                // Check if the player has guessed all the letters
                boolean wordGuessed = true;
                for (int i = 0; i < word.length(); i++) {
                    if (!correctGuesses.contains(word.charAt(i))) {
                        wordGuessed = false;
                        break;
                    }
                }

                if (wordGuessed) {
                    System.out.println("\nCongratulations! You guessed the word: " + word);
                    break;
                }

                System.out.println();
            }

            if (remainingAttempts == 0) {
                System.out.println("Sorry, you've run out of attempts! The word was: " + word);
            }

            // Ask the player if they want to play again
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.nextLine();
        }
    }
}