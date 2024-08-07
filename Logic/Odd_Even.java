import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result=(number & 1)==0?"is Even":"is Odd";
        System.out.println(result);
    }
}
