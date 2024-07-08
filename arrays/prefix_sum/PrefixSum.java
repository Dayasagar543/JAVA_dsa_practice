package JAVA_dsa_practice.arrays.prefix_sum;

public class PrefixSum {

    public int[] sum_prefix(int[] array) {
        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        return prefix;
    }

}
