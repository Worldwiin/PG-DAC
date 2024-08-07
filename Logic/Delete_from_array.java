public class Delete_from_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8,9,10};
        int target = 5;
        int i,k;
        int len = arr.length;
        for (i = 0; i < len; i++) {
            if (arr[i] == target) {
                for (k = i; k < len - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                len--;
                i--;
            }
        }
        for (i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

