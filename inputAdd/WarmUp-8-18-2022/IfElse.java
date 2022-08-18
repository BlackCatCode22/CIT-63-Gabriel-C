import java.util.Scanner;

public class IfElse {
    public static void main(String args[]) {
        // Creating a Scanner object (guesses) for input
        Scanner guesses = new Scanner(System.in);
        // Declare variable
        int n1 = 0;
        // Ask for input
        System.out.println("\nGuess a number between 1-10  " + "Then Press Enter-");
        n1 = guesses.nextInt();
        // logic based on input to see if the number is equal to 6
        if(n1 != 6) {
            System.out.println("\nYou guessed wrong!\n\n");
        } else {
            System.out.println("\nCorrect! My number is six.\n\n");
        }
    }
}
