import java.util.*;

public class ArraySlice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter legth of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter start position from 1 to " + n);
        int start = sc.nextInt();
        System.out.println("Enter end position from 1 to " + n);
        int end = sc.nextInt();

        int slice[] = Arrays.copyOfRange(arr, (start - 1), (end));
        for (int i = 0; i < slice.length; i++) {
            System.out.print(slice[i] + " ");
        }
        sc.close();
    }
}
