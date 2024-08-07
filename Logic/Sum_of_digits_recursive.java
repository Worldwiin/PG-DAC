import java.util.Scanner;

public class Sum_of_digits_recursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int result = sumDigits(num);
        System.out.println("Sum of digits: " + result);
    }
    public static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        num = num / 10;
        return digit + sumDigits(num);
    }
}
