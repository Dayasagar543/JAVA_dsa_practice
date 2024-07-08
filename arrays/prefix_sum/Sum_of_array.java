package JAVA_dsa_practice.arrays.prefix_sum;

public class Sum_of_array {

    public int sum_array(int[] array) {
        int total_sum = 0;
        for (int i = 0; i < array.length; i++) {
            total_sum += array[i];
        }
        return total_sum;
    }

}
