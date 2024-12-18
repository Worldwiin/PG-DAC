public class Number_Compress {
    public static void main(String[] args) {
        int[] dataArray = {1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 1, 1, 5, 5, 5};
        int[] count = new int[10];
        for (int num : dataArray) {
            count[num]++;
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " appears " + count[i] + " times.");
            }
        }
    }
}
/*
o/p:
1 appears 6 times.
2 appears 2 times.
3 appears 4 times.
5 appears 3 times.
 */