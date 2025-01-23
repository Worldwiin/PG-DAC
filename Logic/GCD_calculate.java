import java.util.Scanner;

public class GCD_calculate {

    public static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        int gcd = findGCD(x, y);
        System.out.println("The Greatest Common Divisor of " + x + " and " + y + " is: " + gcd);

    }
}
/*
o/p:
Enter the first number: 28
Enter the second number: 112
The Greatest Common Divisor of 28 and 112 is: 28
 */