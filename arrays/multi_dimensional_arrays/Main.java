package JAVA_dsa_practice.arrays.multi_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        // printing 2D array
        // int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        D2_array ar = new D2_array();
        // ar.printing_2dArray(array1);
        // int[][] values = ar.transform_values_2dArray(array1);
        // System.out.println("printing the transposed array");
        // ar.printing_2dArray(values);

        System.out.println("Taking the input for 1st array");
        int[][] input_array1 = ar.generate_values_2dArray();
        ar.printing_2dArray(input_array1);
        System.out.println("Taking the input for 2nd array");
        int[][] input_array2 = ar.generate_values_2dArray();
        ar.printing_2dArray(input_array2);

        // operations on array
        System.out.println("printing the sum of values");
        ar.sum_mat(input_array1, input_array2);
        System.out.println("printing the sub of values");
        ar.sub_mat(input_array1, input_array2);
        System.out.println("printing the mul of values");
        ar.mul_mat(input_array1, input_array2);
        System.out.println("printing the reversed arrayas");
        ar.reverse_2dArray(input_array1);

    }

}
