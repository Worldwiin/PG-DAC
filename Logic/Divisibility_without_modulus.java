import java.util.Scanner;

public class Divisibility_without_modulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int og = input;

        while (input > 0) {
            input -= 3;
        }

        if (input == 0) {
            System.out.println(og + " is divisible by 3.");
        } else {
            System.out.println(og + " is not divisible by 3.");
        }


    }
}
