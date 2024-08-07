public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {20, 2, 34, 17, 81};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectSort(int [] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            int base = i;
            for (int j = i + 1; j < l; j++) {
                if (arr[j] < arr[base]) {
                    base = j;
                }
            }
            int temp = arr[base];
            arr[base] = arr[i];
            arr[i] = temp;
        }
    }
}
