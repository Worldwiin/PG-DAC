import java.util.Scanner;

public class MaxSubsequence_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array (0s and 1s only): ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }

        if (maxLength == 0) {
            System.out.println("-1");
        } else {
            System.out.println("The max length of consecutive 1's is: " + maxLength);
        }
    }
}
