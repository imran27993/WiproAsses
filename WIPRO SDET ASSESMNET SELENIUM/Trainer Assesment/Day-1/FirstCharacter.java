public class FirstCharacter {
    // Read the first character of the given string
    public static void readFirstCharacter(String str) {
        char ch = str.charAt(0);
        System.out.println("character at 0 " + ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println("character at " + (i + 1) + " " + str.charAt(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        // Read the first character of the given string
        String str = "i am rohan kumar";
        readFirstCharacter(str);
    }
}