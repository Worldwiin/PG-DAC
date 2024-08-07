import java.util.*;

public class MaxSubsequence_new {
    public static void main(String[] args) {
        int currcount = 0;
        int maxcount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        String str = sc.nextLine();
        // String str="001111110111101";
        char[] strarr = str.toCharArray();
        for (int i = 0; i < strarr.length; i++)
        {
            if (strarr[i] == '1') {
                currcount++; // Count consecutive '1's
            } else if (strarr[i] == '0') {
                if (currcount > maxcount) {
                    maxcount = currcount; // Update maxcount if needed
                }
                currcount = 0; // Reset current count
            }
        }
        // Check if the last sequence of '1's is the longest
        if (currcount > maxcount) {
            maxcount = currcount;
        }
        System.out.print(maxcount);
    }
}