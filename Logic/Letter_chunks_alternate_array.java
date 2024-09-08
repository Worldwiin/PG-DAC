public class Letter_chunks_alternate_array {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'x', 'y', 'e', 'f'};

        char[] array3 = new char[array1.length + array2.length];

        int k = 0, i = 0, j = 0;

        while (i < array1.length || j < array2.length) {

            for (int count = 0; count < 2 && i < array1.length; count++) {
                array3[k++] = array1[i++];
            }

            for (int count = 0; count < 2 && j < array2.length; count++) {
                array3[k++] = array2[j++];
            }
        }

        System.out.print("Array3: ");
        for (char c : array3) {
            System.out.print(c + " ");
        }
    }
}
/*
Array3: a b x y c d e f
 */