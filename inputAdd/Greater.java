import java.util.Scanner;

public class Greater {
    public static void main(String args[]) {
        Scanner nums = new Scanner(System.in);
        System.out.println("\nEnter two numbers: " + "-And Press Enter-");
        int n1, n2;
        n1 = nums.nextInt();
        n2 = nums.nextInt();
        if(n1 > n2) {
        System.out.println("\nThe biggest number is " + n1);
        } else {
            System.out.println("\nThe biggest number is " + n2);
        }
    }
}
