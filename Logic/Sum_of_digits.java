import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
          sum = sum + number % 10;
          number = number / 10;
        }
        System.out.println("Sum of the digits: "+sum);
    }
}

