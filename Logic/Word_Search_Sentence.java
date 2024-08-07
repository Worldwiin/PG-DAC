import java.util.Scanner;

public class Word_Search_Sentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the substring to search:");
        String str2 = scanner.nextLine();
        int count = inString(str1, str2);
        if (count > 0) {
            System.out.println("Word occurs " + count + " times.");
        } else {
            System.out.println("Word not found");
        }

    }

    public static int inString(String str1, String str2) {
        int cnt = 0;
        int l1 = str1.length();
        int l2 = str2.length();

        for (int i = 0; i <= l1 - l2; i++) {
            int j = 0;
            int k = i;

            while (j < l2 && str1.charAt(k) == str2.charAt(j)) {
                k++;
                j++;
            }
            if (j == l2) {
                System.out.println("Word '" + str2 + "' Found at position " + i + " to " + (i + l2 - 1));
                cnt++;
            }
        }
        return cnt;
    }
}