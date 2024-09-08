public class Print_matching_elements {
    public static void func(int[] a, int[] b, int n1, int n2) {
        int i = 0, j = 0;
        // Iterate over both arrays
        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);  // Print common elements
                i++;  // Move to the next element in array 'a'
                j++;  // Move to the next element in array 'b'
            } else if (a[i] < b[j]) {
                i++;  // If a[i] is smaller, move forward in array 'a'
            } else {
                j++;  // If b[j] is smaller, move forward in array 'b'
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 9};
        int[] b = {1, 2, 5, 7, 9};

        int n1 = a.length;
        int n2 = b.length;

        func(a, b, n1, n2);
    }
}
/*
o/p:
1
7
9
 */