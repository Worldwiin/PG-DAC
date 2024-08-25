public class Missing_number_array {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        System.out.println("Missing number is: " + findMissingNumber(arr));
    }
}