public class Array_half_sum_replace {
    public static void main(String[] args) {
        int[] arr = {1, 6, 1, 4};
        int replacementValue = 3;

        int len = arr.length;

        if (len % 2 == 0) {
            int mid = len / 2;

            int leftSum = sumOfArray(arr, 0, mid);
            int rightSum = sumOfArray(arr, mid, len);

            if (leftSum == rightSum) {
                System.out.println("The sums of the left and right halves are equal.");
            } else {
                System.out.println("The sums of the left and right halves are not equal.");
                System.out.println("Original Left Sum: " + leftSum + ", Original Right Sum: " + rightSum);
                if (!replaceToBalance(arr, 0, mid, leftSum, rightSum, replacementValue)) {
                    replaceToBalance(arr, mid, len, rightSum, leftSum, replacementValue);
                }
            }
        } else {
            System.out.println("The array length is not even, so it can't be split evenly.");
        }
    }

    private static int sumOfArray(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static boolean replaceToBalance(int[] arr, int start, int end, int largerSum, int smallerSum, int replacementValue) {
        for (int i = start; i < end; i++) {
            int newSum = largerSum - arr[i] + replacementValue;  // New sum if this element is replaced
            if (newSum == smallerSum) {
                System.out.println("Replace element at index " + i + " (value " + arr[i] + ") with " + replacementValue + " to balance the sums.");
                return true;
            }
        }
        return false;
    }
}
//here the array will be split and 3 will replace index 2 element to get equal halves ie 7-7