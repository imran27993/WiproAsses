import java.util.*;

public class ReadNNumbers {
    // Read n numbers and print them
    public static void readNNumbers(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        System.out.println("Enter Elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read n numbers and print them
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        readNNumbers(n);
        sc.close();
    }
}