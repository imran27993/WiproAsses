import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + n + " is " + result);
        sc.close();
    }
}
