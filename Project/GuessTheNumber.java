package Project;
import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int numAttempts = 10;
        int score = 0;
        Random rand = new Random();
        int numberToGuess = rand.nextInt(max - min + 1) + min;
        int guess = 0;

        JOptionPane.showMessageDialog(null, "Guess the number between " + min + " and " + max + ".");

        for (int i = 1; i <= numAttempts; i++) {
            String guessStr = JOptionPane.showInputDialog("Attempt #" + i + ": What's your guess?");
            guess = Integer.parseInt(guessStr);

            if (guess == numberToGuess) {
                score += 10 * (numAttempts - i + 1);
                JOptionPane.showMessageDialog(null, "You guessed the number! Your score is " + score);
                int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
                if (playAgain == JOptionPane.YES_OPTION) {
                    i = 0;
                    score = 0;
                    numberToGuess = rand.nextInt(max - min + 1) + min;
                    continue;
                } else {
                    break;
                }
            } else if (guess < numberToGuess) {
                JOptionPane.showMessageDialog(null, "Your guess is too low.");
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is too high.");
            }

            if (i == numAttempts) {
                JOptionPane.showMessageDialog(null, "You ran out of attempts! The number was " + numberToGuess + ". Your score is " + score);
                int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
                if (playAgain == JOptionPane.YES_OPTION) {
                    i = 0;
                    score = 0;
                    numberToGuess = rand.nextInt(max - min + 1) + min;
                }
            }
        }
    }

}
