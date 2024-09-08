public class Smallest_not_in_Array2 {
    public static void main(String[] args) {
        int[] Array1 = {4, 8, 7, 1, 9};
        int[] Array2 = {3, 7, 9, 1};

        int smallest = findSmallestNotInArr2(Array1, Array2);
        if (smallest != Integer.MAX_VALUE) {
            System.out.println("The smallest element in Array1 that is not present in Array2 is: " + smallest);
        } else {
            System.out.println("All elements of Array1 are present in Array2.");
        }
    }
    public static int findSmallestNotInArr2(int[] Arr1, int[] Arr2) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < Arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < Arr2.length; j++) {
                if (Arr1[i] == Arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found && Arr1[i] < smallest) {
                smallest = Arr1[i];
            }
        }

        return smallest;
    }
}
