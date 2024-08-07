public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {21,32,9,12,92,14};
        bSort(arr);
    }
    public static void bSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
