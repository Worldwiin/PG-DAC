import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("The factorial for the number is: " + fact(n));
    }
    public static int fact(int n) {
        int result;
        if (n==1||n==0) {
            return 1;
        }

        result = n * fact(n-1);
        return result;
    }
}

