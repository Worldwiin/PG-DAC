import java.util.HashMap;
import java.util.Map;

public class String_compress {

    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            compressed.append(entry.getKey());
            compressed.append(entry.getValue());
        }

        if (compressed.length() < input.length()) {
            return compressed.toString();
        } else {
            return input;
        }
    }

    public static void main(String[] args) {
        String input = "aaabbbaabababaccc";
        String compressed = compressString(input);
        System.out.println("Compressed String: " + compressed);
    }
}
//Input: aaabbbaabababaccc
//Output: a8b6c3