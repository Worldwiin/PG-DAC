import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 6;  // Element to search for
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sorted array
        bsearch(arr, no);

    }

    public static void bsearch(int[] arr, int no) {
        int l = 0;
        int u = arr.length - 1; // Set to last index of the array
        int m;
        boolean found = false;

        while (l <= u) {
            m = (l + u) / 2;
            if (no > arr[m]) {
                l = m + 1;
            } else if (no < arr[m]) {
                u = m - 1;
            } else {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
