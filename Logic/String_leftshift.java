public class String_leftshift {
    public static void main(String[] args) {
        int[] arr = {23, 43, 12, 12, 19};
        int temp = arr[0];
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[i] = temp;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
