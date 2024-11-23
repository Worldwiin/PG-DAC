public class Vowel_checker {
    public static void main(String[] args) {
        String input = "Hello World";
        String vowels = "aeiouAEIOU";
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel.");
            }
        }
    }
}
