public class StringToArray {
    // Convert String to character array and print them
    public static void charArray(String str) {
        char arr[] = new char[str.length()];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                arr[j] = str.charAt(i);
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Convert String to character array and print them
        String str1 = "hello world";
        charArray(str1);
    }
}
