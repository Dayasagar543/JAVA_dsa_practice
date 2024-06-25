package JAVA_dsa_practice.arrays;

public class Target_sum {
    public int sum_target(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == value) {
                    count++;
                }
            }
        }

        return count;
    }

}
