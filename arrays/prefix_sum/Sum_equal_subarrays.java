package JAVA_dsa_practice.arrays.prefix_sum;

public class Sum_equal_subarrays {

    public boolean sum_sub_arrays(int[] array) {

        // we can use prefix sum method

        // Prefix_sum_same_array ps = new Prefix_sum_same_array();
        // int[] values = ps.sum_prefix(array);

        // Reversed_prefix_sum rp = new Reversed_prefix_sum();
        // int[] values1 = rp.reversed_prefixsum(array);
        Sum_of_array sa = new Sum_of_array();
        int total_sum = sa.sum_array(array);
        // we can also use the sum of equal partions of array
        int prefix_sum = 0, sufix_sum = 0;

        for (int i = 0; i < array.length; i++) {
            prefix_sum += array[i];
            sufix_sum = total_sum - prefix_sum;
            if (sufix_sum == prefix_sum) {
                return true;
            }
        }

        return false;

    }

}
