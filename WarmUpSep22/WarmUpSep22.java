import java.util.Scanner;
import java.util.Arrays;

public class WarmUpSep22 {
    public static void main(String[] args) {
        int numbersArray[] = {999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999};
        int input = 0;
        int index = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Here is the array before " + Arrays.toString(numbersArray));
        // Get input from user
        while(index != 20) {
            try {
                System.out.println("\n Enter twenty numbers");
                input = userInput.nextInt();
                numbersArray[index] = input;
            } catch (Exception e) {
                System.out.println("Entered value is not an integer");
                userInput.nextLine();
                index = index - 1;
            }
            index = index + 1;
        }
        // Give out results
        System.out.println("\n Here is the array now " + Arrays.toString(numbersArray));
         int largest = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++)
            if (numbersArray[i] > largest)
                largest = numbersArray[i];
        System.out.println("\n Here is the largest number " + largest);
        int smallest = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++)
            if (numbersArray[i] < smallest)
                smallest = numbersArray[i];
        System.out.println("\n Here is the smallest number " + smallest);
    }
}
