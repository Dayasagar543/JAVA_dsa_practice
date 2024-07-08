package JAVA_dsa_practice.arrays.prefix_sum;

public class OptimizingArrCalPrefixSum {
    public int[] sumOfNumbers(int[] array) {
        for (int k = 1; k <array.length; k++) {
            array[k] = array[k - 1] + array[k];
        }
        return array;
    }
}