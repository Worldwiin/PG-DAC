import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int t =0;
        while (t != 1)
        {
            t = number % 2;
            number = number / 2;
            System.out.print(t);
        }

    }
}

