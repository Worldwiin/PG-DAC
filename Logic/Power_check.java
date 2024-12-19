import java.util.Scanner;

public class Power_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base number (n): ");
        int n = input.nextInt();

        System.out.println("Enter the number to check (p): ");
        int p = input.nextInt();

        if (n <= 1 || p < 1) {
            System.out.println("Invalid input. Base number must be > 1, and the number to check must be positive.");
            return;
        }

        if (isPower(n, p)) {
            System.out.println(p + " is a power of " + n);
        } else {
            System.out.println(p + " is not a power of " + n);
        }
    }

    public static boolean isPower(int n, int p) {
        while (p > 1) {
            if (p % n != 0) {
                return false;
            }
            p /= n;
        }
        return true;
    }
}