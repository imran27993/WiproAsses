import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter legth of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position you want to add new element");
        int position = sc.nextInt();
        System.out.println("Enter the value");
        int value = sc.nextInt();
        if (position < 1 || position > n) {
            System.out.println("Invali position");
        } else {
            int arr2[] = new int[n + 1];
            for (int i = 0; i < position - 1; i++) {
                arr2[i] = arr[i];
            }
            arr2[position - 1] = value;
            for (int i = position - 1; i < arr.length; i++) {
                arr2[i + 1] = arr[i];
            }
            System.out.println("Array after insertion: " + Arrays.toString(arr2));
        }

        sc.close();
    }
}
