public class String_compress_3 {
    public static void main(String[] args) {
        String data = "aaabbbaabababaCCC";
        int[] count = new int[52]; // Array size 52: [0-25] for 'a'-'z', [26-51] for 'A'-'Z'

        // Count occurrences of each character
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++; // Lowercase letters stored at index 0-25
            } else if (ch >= 'A' && ch <= 'Z') {
                count[ch - 'A' + 26]++; // Uppercase letters stored at index 26-51
            }
        }

        // Print the compressed output
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.print((char) (i + 'a') + "" + count[i]);
            }
        }
        for (int i = 26; i < 52; i++) {
            if (count[i] > 0) {
                System.out.print((char) (i - 26 + 'A') + "" + count[i]);
            }
        }
    }
}
/*
Input: aaabbbaabababaCCC
Output: a8b6C3
*/