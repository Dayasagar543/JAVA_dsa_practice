package JAVA_dsa_practice.arrays.matrix;

public class Spiral_traversal {

    public void print_sprial(int[][] matrix,int rows, int cols) {
       
            int toprow = 0, right_col = cols - 1, bottom_row = rows - 1, left_col = 0;
            int i = 0;
            while (i < rows * cols) {
                // top row
                for (int j = 0; j <= right_col; j++) {
                    System.out.print(matrix[toprow][j]+" ");
                    i++;
                }
                toprow++;
                // right column
                for (int j = 0; j <= right_col; j++) {
                    System.out.print(matrix[j][right_col]+" ");
                    i++;
                }
                right_col--;
                // bottom row
                for (int j = right_col; j >= left_col; j--) {
                    System.out.print(matrix[bottom_row][j]+" ");
                    i++;
                }
                bottom_row--;
                // left column
                for (int j = bottom_row; j >= toprow; j--) {
                    System.out.print(matrix[j][left_col]+" ");
                    i++;
                }
                left_col++;
            }
        
    }

}
