public class Unique_array {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 3, 4, 7, 7, 7, 9};
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements to the left to remove the duplicate
                    for (int k = j; k < len - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    len--; // Decrease the length since we removed an element
                    j--; // Decrement j to check the new element at position j
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}