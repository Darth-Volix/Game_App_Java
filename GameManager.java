public class GameManager {
    public static void main(String[] args) {
        HangmanGame hangmanGame = new HangmanGame();
        NumberGame numberGame = new NumberGame();

        hangmanGame.startGame();
        numberGame.startGame();
    }
}
