import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        int fact = 1;
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n == 0 || n == 1) {
            System.out.println("Factorial of " + n + " is 1");
        } else {

            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
        sc.close();
    }
}
