public class Array_index_skip_multiplication {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 9};
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    result[i] *= arr[j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("Value at index " + i + " is " + result[i]);
        }
    }
}
