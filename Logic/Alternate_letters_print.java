import java.util.Scanner;

public class Alternate_letters_print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a starting letter: ");
        char start = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        StringBuilder result = new StringBuilder();
        char current = start;

        for (int i = 0; i < 13; i++) {
            result.append(current).append(" ");
            current += 2;
            if (current > 'Z') {
                current = (char) (current - 26);
            }
        }
        System.out.println(result.toString().trim());
    }
}
/*
Enter a starting letter: M
M O Q S U W Y A C E G I K
 */