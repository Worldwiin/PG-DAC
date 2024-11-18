import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.equals("")) {
            return 0;
        }

        // Starting window index
        int start = 0;
        // Ending window index
        int end = 0;
        // Maximum length of substring
        int maxLength = 0;
        // This set will store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();

        // Loop for each character in the string
        while (end < s.length()) {
            // If the current character is not a duplicate
            if (uniqueCharacters.add(s.charAt(end))) {
                // Move the end pointer to expand the window
                end++;
                // Update maxLength if the current window is larger
                maxLength = Math.max(maxLength, end - start);
            } else {
                // If there's a duplicate, shrink the window from the left
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}
/*
Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */