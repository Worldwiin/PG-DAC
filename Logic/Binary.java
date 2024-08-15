import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] arr = new int[32];
        int index = 0;

        while (number > 0) {
            arr[index++] = number % 2;
            number = number / 2;
        }

        System.out.print("Binary representation: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}