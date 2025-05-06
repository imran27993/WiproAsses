import java.util.Arrays;

public class RemoveDuplicate {
    // Remove duplicates from array
    public static void removeDuplicate(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Remove duplicates from array
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4 };
        System.out.println("Before removing duplicate " + Arrays.toString(arr));
        removeDuplicate(arr);
    }
}
