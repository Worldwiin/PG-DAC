import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        int i, j, s, n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        for (i = 1; i <= row; i++) {
            for (s = i; s < row; s++)
                System.out.print(" ");
            for (j = 1; j <= n; j++)
                if (j % 2 == 0)
                    System.out.print("2");
                else
                    System.out.print("1");
            n = n + 2;
            System.out.println();
        }
    }
}
