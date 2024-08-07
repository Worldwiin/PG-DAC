import java.util.Scanner;

public class FindHighest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        c = scanner.nextInt();
        int highest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The highest number is: "+highest);

    }
}
