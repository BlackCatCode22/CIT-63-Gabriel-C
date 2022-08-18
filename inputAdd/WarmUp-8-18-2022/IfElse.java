import java.util.Scanner;

public class IfElse {
    public static void main(String args[]) {
        Scanner guesses = new Scanner(System.in);
        System.out.println("\nGuess a number between 1-10  " + "Then Press Enter-");
        int n1;
        n1 = guesses.nextInt();
        if(n1 != 6) {
            System.out.println("\nYou guessed wrong!\n\n");
        } else {
            System.out.println("\nCorrect! My number is six.\n\n");
        }
    }
}
