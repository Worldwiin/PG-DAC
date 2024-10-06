public class Count_N_between_start_end {
    public static void main(String[] args) {
        int count = 0;
        int N = 9;

        for (int i = 1; i <= 100; i++) {

            if (i % 10 == N) {
                count++;
            }

            if (i / 10 == N) {
                count++;
            }
        }

        System.out.println("The digit 9 appears " + count + " times between 1 and 100.");
    }
}
/*
O/p: The digit 9 appears 20 times between 1 and 100.
 */
