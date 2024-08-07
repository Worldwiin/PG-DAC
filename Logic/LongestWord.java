import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        String longestword = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestword.length()) {
                longestword = words[i];
            }
        }
        System.out.println("Longest word in the sentence is: "+longestword+" with length: "+longestword.length());
    }
}
