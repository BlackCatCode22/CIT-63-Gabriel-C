import java.util.Scanner;
import static java.lang.System.out;

public class WarmUpAug30 {
   public static void hello() {
        System.out.println("\n Hello from hello()!");
    }
    public static int addTwoNumbers(int num1, int num2) {
        int result = 0;
        result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {
       System.out.println("\nWarmup Aug 30th 2022!");
       hello();
       System.out.println("\nThe sum of two numbers is " + addTwoNumbers(7, 3) + "\n");
    }
}
