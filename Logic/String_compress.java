import java.util.HashMap;

public class String_compress {
    public static void main(String[] args) {
        String data = "aaabbbaabababaCCC";
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : countMap.keySet()) {
            System.out.print(ch + "" + countMap.get(ch));
        }
    }
}
/*
Input: aaabbbaabababaCCC
Output: a8b6C3
*/