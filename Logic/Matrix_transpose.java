public class Matrix_transpose {
    public static void main(String[] args) {
        int [][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Before Transpose:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        int rows = A.length;
        int cols = A[0].length;
        int [][] B = new int[cols][rows];

        doTranspose(A, B);

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void doTranspose(int [][] A, int [][] B) {
        int rows = A.length;
        int cols = A[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[j][i] = A[i][j];
            }
        }
    }
}
