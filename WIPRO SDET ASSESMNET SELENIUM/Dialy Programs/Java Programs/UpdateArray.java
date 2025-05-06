import java.util.*;

public class UpdateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter legth of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.print("Enter the position to update (1 to " + arr.length + "): ");
        int position = sc.nextInt();
        System.out.print("Enter the new value: ");
        int newValue = sc.nextInt();
        if (position > 0 && position <= arr.length) {
            arr[position - 1] = newValue;
            System.out.println("Updated array: " + Arrays.toString(arr));
        } else {
            System.out.println("Invalid position!");
        }
        sc.close();
    }
}
