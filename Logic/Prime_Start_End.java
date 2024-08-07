import java.util.Scanner;

public class Prime_Start_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = sc.nextInt();
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(i);
            }
        }
    }
}
