import java.util.Arrays;

public class Segregate_array {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 1, 1, 0};
        int countOnes = 0;
        for (int num : arr) {
            if (num == 1) {
                countOnes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < countOnes) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*
o/p:[1, 1, 1, 1, 1, 0, 0, 0, 0, 0]
 */