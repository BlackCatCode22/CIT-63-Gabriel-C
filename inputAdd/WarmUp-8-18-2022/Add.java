import java.util.Scanner;

public class Add {
    public static void main(String args[]) {
        // Creating a Scanner object (numbers) for input
        Scanner numbers = new Scanner(System.in);
        // Declaring variables.
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        // Ask for input
        System.out.println("\nEnter First number: " + "-And press enter-");
        n1 = numbers.nextInt();
        System.out.println("\nEnter Second number: " + "-And press enter-");
        n2 = numbers.nextInt();
        // Adds stored inputs and displays the total
        n3 = n1 + n2;
        System.out.println("\nThe total is: " + n3 + "\n\n");
    }
}
