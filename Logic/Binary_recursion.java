import java.util.Scanner;

public class Binary_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Binary representation: ");
        binary(n);

    }

    private static void binary(int n) {


        int bin=0;
        if (n <= 0) {
           return;
        }
        bin = n % 2;
        binary(n / 2);
        System.out.println(bin);
    }

}


