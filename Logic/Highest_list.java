import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Highest_list {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        numbers.add(scanner.nextInt());
        System.out.println("Enter the second number: ");
        numbers.add(scanner.nextInt());
        System.out.println("Enter the third number: ");
        numbers.add(scanner.nextInt());
        int max = Collections.max(numbers);
        System.out.println("The highest number is: " + max);
    }
}