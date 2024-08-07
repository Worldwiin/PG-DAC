import java.util.Scanner;

public class Divisibility_3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        //using ternary operator
        String result = (number % 3 == 0 && number % 7 == 0) ? "Divisible by both 3 and 7!" :
                (number % 3 == 0) ? "Divisible by 3!" :
                        (number % 7 == 0) ? "Divisible by 7!" :
                                "Not divisible by 3 or 7.";

        System.out.println(result);
    }
}