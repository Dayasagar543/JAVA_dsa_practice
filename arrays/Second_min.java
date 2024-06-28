package JAVA_dsa_practice.arrays;

public class Second_min {
    public int second_min(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array[i] = Integer.MAX_VALUE;
            }
        }
        Min_value miv = new Min_value();
        int minvalue = miv.MinValue(array);
        return minvalue;
    }
}
