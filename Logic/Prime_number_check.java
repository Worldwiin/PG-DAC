import java.util.Scanner;

public class Prime_number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        boolean flag = true;

        if (no <= 1) {
            flag = false;
        } else {

            for (int i = 2; i <= no/2; i++) {
                if (no % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println(no + " is a prime number.");
        } else {
            System.out.println(no + " is not a prime number.");
        }
    }
}