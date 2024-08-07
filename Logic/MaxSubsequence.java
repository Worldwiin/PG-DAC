import java.util.Scanner;

public class MaxSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        String s = scanner.nextLine();
        String[] sub = s.split("0");
        int maxLength = 0;
        for (int i = 0; i < sub.length; i++) {
            if (sub[i].length() > maxLength) {
                maxLength = sub[i].length();
            }
        }
        if (maxLength == 0) {
            System.out.println("-1");
        }
        else{
            System.out.println("The max subsequence of 1's is: " + maxLength);
        }
    }
}