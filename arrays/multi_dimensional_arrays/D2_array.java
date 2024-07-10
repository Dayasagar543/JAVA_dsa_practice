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

    public int[][] sum_mat(int array1[][], int rows1, int columns1, int array2[][], int rows2, int columns2) {
        int[][] array3 = new int[array1.length][array2.length];
        if (rows1 == rows2 && columns1 == columns2) {
            for (int i = 0; i < array3.length; i++) {
                for (int j = 0; j < array3[i].length; j++) {
                    array3[i][j] = (array1[i][j] + array2[i][j]);
                }
            }
        }

        return array3;
    }

    public int[][] sub_mat(int array1[][], int rows1, int columns1, int array2[][], int rows2, int columns2) {
        int[][] array3 = new int[array1.length][];
        {
            if (rows1 == rows2 && columns1 == columns2)
                for (int i = 0; i < array3.length; i++) {
                    for (int j = 0; j < array3[i].length; j++) {
                        array3[i][j] = (array1[i][j] - array2[i][j]);
                    }
                }
        }

        return array3;
    }

    public int[][] mul_array(int array1[][], int rows1, int columns1, int array2[][], int rows2, int columns2) {
        int[][] array3 = new int[array1.length][];
        {
            if (rows1 == columns2)
                for (int i = 0; i < array3.length; i++) {
                    for (int j = 0; j < array3[i].length; j++) {
                        array3[i][j] = (array1[i][j] * array2[i][j]);
                    }
                }
        }

        return array3;
    }

}