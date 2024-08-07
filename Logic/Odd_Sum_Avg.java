import java.util.Scanner;

public class Odd_Sum_Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        int count = 0;
        System.out.println("Enter 5 array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Odd array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                sum=sum+ arr[i];
                count++;
            }
        }
        double avg = sum/count;
        System.out.println("Odd Sum Average: "+avg);
        System.out.println("Sum of odd arr: " + sum);
    }
}