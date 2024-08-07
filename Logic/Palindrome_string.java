import java.util.Scanner;

public class Palindrome_string {
    public boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_string pon = new Palindrome_string();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        if (pon.isPalindrome(word)) {
            System.out.println("The String is palindrome !!");
        }
        else {
            System.out.println("The String is not palindrome !!");
        }
    }
}