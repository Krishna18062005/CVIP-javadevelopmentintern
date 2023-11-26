import java.util.Scanner;
import java.util.Random;

public class numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        int numberOfGuesses = 0;

        do {
            System.out.print("Enter your guess between 1 to 100: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + numberOfGuesses + " tries.");
                break;
            }

            numberOfGuesses++;
        } while (numberOfGuesses < 5);

        if (numberOfGuesses == 5) {
            System.out.println("You ran out of guesses. The correct number was " + randomNumber);
        }
    }
}
