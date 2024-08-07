import java.util.Scanner;

public class IncrementByOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("==================");
        for (int i = 1; i <= 5; i++) {
            System.out.println(number);
            number++;
        }

    }
}
