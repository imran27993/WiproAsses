import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int arr[], int key) {
        Arrays.sort(arr);
        int n = arr.length;
        int si = 0, end = n - 1;
        while (si <= end) {
            int mid = (si + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr3[] = { 1, 2, 3, 4, 5 };
        int key1 = 2;
        int result = binarySearch(arr3, key1);
        System.out.println("Element found at index " + result);
    }
}
