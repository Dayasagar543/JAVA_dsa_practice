package JAVA_dsa_practice.arrays;

public class Triplet_sum_target {

    public int sum_Triple(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if ((array[i] + array[j] + array[k]) == value) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
