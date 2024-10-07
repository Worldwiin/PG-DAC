public class Square_root_calculate {
    public static int sqrt(int number) {
        int start = 1;
        int end = number;
        int result = 0;
        //Binary search logic
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid <= number) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 1024;
        System.out.println("Square root of " + N + " is: " + sqrt(N));
    }
}
/*
O/p: Square root of 1024 is: 32
 */