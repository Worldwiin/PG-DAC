public class Matrix_column_row_add {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        doMatrixRowColAdd(matrix);
    }
    public static void doMatrixRowColAdd(int[][] matrix) {
        int rows=0;
        int cols=0;
        for(int i=0;i<matrix.length;i++){
            rows+=matrix[0][i];
        }
        for(int i=0;i<matrix.length;i++){
            cols+=matrix[i][0];
        }

        System.out.println("Sum of the Matrix rows: "+rows);
        System.out.println("Sum of the Matrix rows: "+cols);

    }
}
