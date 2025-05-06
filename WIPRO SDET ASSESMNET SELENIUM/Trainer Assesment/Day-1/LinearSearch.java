import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return (i + 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int res = linearSearch(arr, key);
        if (res != -1) {
            System.out.println("Key found at position " + res);
        } else {
            System.out.println("Key not found");
        }
        sc.close();
    }
}
