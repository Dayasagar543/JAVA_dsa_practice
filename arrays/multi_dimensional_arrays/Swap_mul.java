package JAVA_dsa_practice.arrays.multi_dimensional_arrays;

public class Swap_mul {
    public void swap_mul(int[][] array, int i, int j, int k) {
        array[i][j] = array[i][j] + array[k][j];
        array[k][j] = array[i][j] - array[k][j];
        array[i][j] = array[i][j] - array[k][j];
    }
}
