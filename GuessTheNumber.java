package mypackage; // Package name

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;
        
        System.out.println("Guess the number (between 1 and 100):");
        
        // Loop until the user guesses correctly
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
