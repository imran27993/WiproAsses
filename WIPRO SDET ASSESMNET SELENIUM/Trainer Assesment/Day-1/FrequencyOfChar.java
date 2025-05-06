public class FrequencyOfChar {
    // Find the frequency of each character in the given string
    public static void charFrequency(String str) {
        int freq[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                freq[str.charAt(i)]++;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Find the frequency of each character in the given string
        String str2 = "i am rohan kumar";
        charFrequency(str2);
    }
}
