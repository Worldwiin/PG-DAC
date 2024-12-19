import java.util.Scanner;

public class Perfect_square_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }

    }
    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}
/*
o/p:
Enter a number: 1225
1225 is a perfect square.
 */