package JAVA_dsa_practice.arrays.multi_dimensional_arrays;

public class Main {
    public static void main(String[] args) {
        // printing 2D array
        int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        D2_array ar = new D2_array();
        ar.printing_2dArray(array1);
        int[][] values = ar.transpose(array1);
        System.out.println("printing the transposed array");
        ar.printing_2dArray(values);

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
        int[][] array5 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        ar.reverse_2dArray(array5);
        
        int[][] array6 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Transposing inplace array");
        ar.inplace_transpose(array6);
        ar.printing_2dArray(array6);
        int[][] array7 = { { 1, 2, 3 ,4}, { 5, 6 ,7, 8}, {  9,10,11,12 } ,{13,14,15,16}};
        System.out.println("printing 90 degree rotated array");
        ar.rotate_9_0(array7);
        

    }

}
