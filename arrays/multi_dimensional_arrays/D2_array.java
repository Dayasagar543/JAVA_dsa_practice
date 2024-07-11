package JAVA_dsa_practice.arrays.multi_dimensional_arrays;

import java.util.Scanner;

public class D2_array {

    public void printing_2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

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

    public void mul_mat(int array1[][], int array2[][]) {
        int rows2 = array2.length;// rows of second matrix
        int columns1 = array1[0].length;// columns of first matrix
        if (rows2 != columns1) {
            System.out.println("multiplication is not possible");
            return;
        }
        int[][] array3 = new int[columns1][rows2];

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (array1[i][j] * array2[j][i]);
            }
        }

        D2_array d2 = new D2_array();
        d2.printing_2dArray(array3);
    }

}