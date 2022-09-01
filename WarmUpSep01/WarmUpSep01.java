import java.util.Scanner;
import static java.lang.System.out;

public class WarmUpSep01 {
    static void hello() {
        System.out.println("\nHello from hello()!");
        System.out.println("\nIt's September 1st 2022!");

    }

    static void largest() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("\n--Let's check which number is bigger--");

        System.out.println("\n Enter a value for num1: ");
        num1 = userInput.nextInt();

        System.out.println("\n Enter a value for num2: ");
        num2 = userInput.nextInt();

        System.out.println("\n Enter a value for num3: ");
        num3 = userInput.nextInt();

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

    static String chooseTheDay(int num1) {
        String theDay = "";
        switch (num1) {
            case 0:
                theDay = "Please enter a number between 1-7";
                break;
            case 1:
                theDay = "Sunday";
                break;
            case 2:
                theDay = "Monday";
                break;
            case 3:
                theDay = "Tuesday";
                break;
            case 4:
                theDay = "Wednesday";
                break;
            case 5:
                theDay = "Thursday";
                break;
            case 6:
                theDay = "Friday";
                break;
            case 7:
                theDay = "saturday";
                break;
            default:
                theDay = "Please enter a number between 1-7";
                break;
        }
        return theDay;
    }

    public static void dayoftheweek() {
        String theDay = "";
        int num1 = 0;
        Scanner day = new Scanner(System.in);
        System.out.println("\n--Choose a day between 1=Sunday to 7=Saturday--");
        System.out.println("\n Enter a value for the day: ");
        num1 = day.nextInt();
        System.out.println("\nThat day is " + chooseTheDay(num1) + "\n");
    }

    public static void main(String... args) {
        hello();
        dayoftheweek();
        largest();
    }
}
