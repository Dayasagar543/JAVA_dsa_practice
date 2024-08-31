package JAVA_dsa_practice.arrays.multi_dimensional_arrays;

// import java.security.PublicKey;
import java.util.Scanner;

public class D2_array {

    Swap_mul sm = new Swap_mul();

    public void printing_2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    // reading the input values from the user
    public int[][] reading_values_2dArray() {
        // taking input for the number of rows and columns
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number of rows");
        int rows = sc.nextInt();
        System.out.println("input the number of columns");
        int columns = sc.nextInt();
        // creating the array
        int array[][] = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("please input the values for the array ");
                array[i][j] = sc.nextInt();

            }
        }
        sc.close();
        return array;
    }

    // auto generation of values for the matrix
    public int[][] generate_values_2dArray() {
        // taking input for the number of rows and columns
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number of rows");
        int rows = sc.nextInt();
        System.out.println("input the number of columns");
        int columns = sc.nextInt();
        // creating the array
        int array[][] = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    // matrix addition
    public void sum_mat(int array1[][], int array2[][]) {
        int rows1 = array1.length, rows2 = array2.length;
        int columns1 = array1[0].length, columns2 = array2[0].length;
        if (rows1 != rows2 && columns1 != columns2) {
            System.out.println("addition is not possbile");
            return;
        }
        int[][] array3 = new int[rows1][columns1];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (array1[i][j] + array2[i][j]);
            }
        }

        D2_array d2 = new D2_array();
        d2.printing_2dArray(array3);

    }

    // matrix subtraction
    public void sub_mat(int array1[][], int array2[][]) {
        int rows1 = array1.length, rows2 = array2.length;
        int columns1 = array1[0].length, columns2 = array2[0].length;
        if (rows1 != rows2 && columns1 != columns2) {
            System.out.println("subtraction is not possbile");
            return;
        }
        int[][] array3 = new int[rows1][columns1];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (array1[i][j] - array2[i][j]);
            }
        }

        D2_array d2 = new D2_array();
        d2.printing_2dArray(array3);

    }

    // matrix multiplication
    public void mul_mat(int array1[][], int array2[][]) {
        int rows1 = array1.length, rows2 = array2.length;// rows of second matrix
        int columns1 = array1[0].length, columns2 = array2[0].length;// columns of first matrix
        if (rows2 != columns1) {
            System.out.println("multiplication is not possible");
            return;
        }
        int[][] array3 = new int[rows1][columns2];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < columns1; k++) {

                    array3[i][j] += (array1[i][k] * array2[k][j]);
                }
            }
        }

        D2_array d2 = new D2_array();
        d2.printing_2dArray(array3);
    }

    // reverse the sub array
    public void reverse_2dArray(int[][] array) {
        // outer array length
        int row1 = array.length;
        // inner array intial and final indexes
        int j = 0, k = array[0].length - 1;
        // swap class instanciation
        Swap_mul sm = new Swap_mul();

        // loop for outer array
        for (int i = 0; i < row1; i++) {
            // iteration for inner array
            while (j <= k) {

                sm.swap_mul(array, i, j, k);//swapping the values internally so as to reverse the values
                j++;
                k--;
            }
        }
        D2_array d2 = new D2_array();
        d2.printing_2dArray(array);// priting the array method
    }

    // transpose
    public int[][] transpose(int[][] array) {
        int rows = array.length, columns = array[0].length;
        int[][] out_array = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                out_array[i][j] = array[j][i];
            }
        }
        return out_array;
    }

    // inplace transpose
    public void inplace_transpose(int[][] array) {
        int rows = array.length, columns = array[0].length;
        for (int  i = 0; i < rows; i++) {
            for (int j = i; j < columns; j++) {
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
     
    }
}
