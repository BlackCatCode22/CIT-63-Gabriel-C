import java.util.Scanner;

public class mult {
    public static void main(String args[]) {
        Scanner nums = new Scanner(System.in);
        System.out.println("\nEnter two numbers: " + "-And Press Enter-");
        int n1, n2 , n3;
        n1 = nums.nextInt();
        n2 = nums.nextInt();
        n3 = n1 * n2;
        System.out.println("\nThe total is " + n3);
    }
}
