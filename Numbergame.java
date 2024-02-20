import java.util.*;
public class Numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int lowerBound = 1; // Define the lower bound of the range
        int upperBound = 100; // Define the upper bound of the range

        // Initialize variables for score and rounds
        int score = 0;
        int rounds = 0;

        while (true) {
            int randomNumber = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("I have picked a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
            int attempts = 0; // Initialize attempts for each round

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                    score += attempts; // Update the score
                    rounds++; // Increment rounds won
                    break; // Exit the loop for this round
                }

                if (attempts >= 5) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + randomNumber);
                    break; // Exit the loop for this round
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your total score is: " + score + " in " + rounds + " rounds.");
                break; // Exit the loop for playing multiple rounds
            }
        }


    }
}
