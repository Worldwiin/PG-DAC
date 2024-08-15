import java.util.Scanner;

public class Power_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Enter another number to check its power: ");
        int p = input.nextInt();
        if (powerCheck(n, p)) {
            System.out.println("Number is  a power");
        } else {
            System.out.println("Number is not a power");
        }
    }

    public static boolean powerCheck(int n, int p) {
        if (p == 1) {
            return true;
        } else {
            while (p > 1) {
                if (p % n != 0) {
                    return false;
                }
                p = p / n;

            }
            return true;
        }
    }
}
