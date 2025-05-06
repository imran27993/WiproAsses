import java.util.*;

public class DeleteElement {
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
        System.out.print("Enter the element to delete : ");
        int ele = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                n--;
                found = true;
            }
        }
        if (found) {
            System.out.println("Array after deleting value " + ele);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Value not found in array");
        }

        sc.close();
    }
}
