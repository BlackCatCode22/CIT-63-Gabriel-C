import java.util.Scanner;

public class WarmUpAug23 {
    public static void main(String[] args){
        System.out.println("\n-Java WarmUp-");
        System.out.println("\nAugust 23, 2022");

        // variables are declared and initialized here.
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        // Create a scanner object that will be used for user input.
        Scanner userInput = new Scanner(System.in);

        // Get three numbers from the user.
        System.out.println("\n Enter a value for num1: ");
        num1 = userInput.nextInt();

        System.out.println("\n Enter a value for num2: ");
        num2 = userInput.nextInt();

        System.out.println("\n Enter a value for num3: ");
        num3 = userInput.nextInt();

        // Output the three numbers.
        System.out.println("\n Here are the three numbers entered: " + num1 + ",  " + num2 + ", " + num3);

        // Create a decision control structure
        if (num1 > num2)
        {
            System.out.println("\n " + num1 + " is greater than " + num2);
        }
        else {
            System.out.println("\n " + num2 + " is greater than " + num1);
        }

        // Create a repetition control structure
        for (int i = 0; i < 4; i++ ) {
            System.out.println("\n num1 is equal to " + num1 + " and the value of i in this for loop is: " + i);
            num1++;
        }

        System.out.println("\n The final value of num1 is equal to " + num1);

        // Create another repetition control structure.
        int whileLoopInt = 0;

        while (whileLoopInt < 4)
        {
            System.out.println("\n num2 = " + num2 + " and the value of my while loop is: " + whileLoopInt);
            whileLoopInt++;
            num2++;
        }

        System.out.println("\n The final value of num2 is equal to " + num2);


        // flash bonus point challenge! 10 bonus points!
        if (num1 > num2 && num1 > num3) {
            System.out.println("\n " + num1 + " is the largest!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("\n " + num2 + " is the largest!");
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("\n There is a tie for the largest number!");
        } else {
            System.out.println("\n " + num3 + " is the largest!\n");
        }
    }
}
