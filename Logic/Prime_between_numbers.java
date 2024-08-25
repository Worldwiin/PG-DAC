import java.util.ArrayList;
import java.util.Scanner;

public class Prime_between_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start = sc.nextInt();
        System.out.println("Enter the end number: ");
        int end = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = start + 1; i < end; i++) {
            int c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                primes.add(i);
            }
        }
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int prime : primes) {
            System.out.println(prime);
        }
		/*
		  To convert ArrayList to array
		 Integer[] primesArray = primes.toArray(new Integer[0]);
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int prime : primesArray) {
            System.out.println(prime);
        }
        */
    }
}
