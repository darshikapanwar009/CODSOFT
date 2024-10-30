import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        boolean playAgain;
        
        do {
            // Choose a random number between 1 and 100
            int GoalNum = ran.nextInt(100) + 1; 
            int play = 0;
            int MaxAttempts = 7;
            boolean GuessedCorrectly = false;

            System.out.println("Guessing Game on!Can you crack the code?");
            System.out.println("Guess the number 1 to 100.");
            System.out.println("You have " + MaxAttempts + " attempts to guess it.");

            while (play < MaxAttempts && !GuessedCorrectly) {
                System.out.print("Enter your guessed number: ");
                int userGuess = sc.nextInt();
                play++;

                // Compare user's guess with the Goal number
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("enter a number between 1 and 100.");
                } else if (userGuess < GoalNum) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > GoalNum) {
                    System.out.println("Too high! Try again.");
                } else {
                    GuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number: " + GoalNum);
                    System.out.println("It took you " + play + " attempts.");
                }
            }

            if (!GuessedCorrectly) {
                System.out.println("Sorry! You've used all your attempts. The correct number was: " + GoalNum);
            }

            System.out.print("Want to give it another shot? (yes/no): ");
            String reply = sc.next().toLowerCase();
            playAgain = reply.equals("yes");
        } while (playAgain);

        System.out.println("Thank you for playing! See you next time!");
        sc.close();
    }
}
