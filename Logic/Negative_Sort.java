import java.util.Arrays;

public class Negative_Sort {
    public static void main(String[] args) {
        int[] arr = {19, -13, 15, -12, -18, -16, 1, 3};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[count];
                arr[count++] = arr[i];
                arr[i] = temp;
               // count++;
            }
        }
        System.out.println("Negatives at the beginning of the array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorting the array in ascending: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
//[-13, -12, -18, -16, 15, 19, 1, 3]