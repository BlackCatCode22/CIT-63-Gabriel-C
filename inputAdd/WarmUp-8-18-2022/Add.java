import java.util.Scanner;

public class Add {
    public static void main(String args[]) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("\nEnter two numbers: " + "-And press enter-");
        int n1, n2, n3;
        n1 = numbers.nextInt();
        n2 = numbers.nextInt();
        n3 = n1 + n2;
        System.out.println("\nThe total is: " + n3);
    }
}
