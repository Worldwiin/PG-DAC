public class First_unique_character {
    public static void main(String[] args) {
        String input = "vishvajeet";
        int index = firstCharIndex(input);
        System.out.println("First unique character is at index: "+index);
    }
    public static int firstCharIndex(String s) {
        int n = s.length();
        int[] counts = new int[256];
        for (int i = 0; i < n; i++) {
            counts[s.charAt(i)]++;
        }
        for (int i = 0; i < n; i++) {
            if (counts[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
