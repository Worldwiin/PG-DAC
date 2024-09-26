public class String_words_reverse {
    public static void main(String[] args) {
        String input = "VINCENT VEGA";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        System.out.println(result.trim());
    }
}
/*
Output: TNECNIV AGEV
 */