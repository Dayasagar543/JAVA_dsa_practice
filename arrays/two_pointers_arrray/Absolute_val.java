package JAVA_dsa_practice.arrays.two_pointers_arrray;

public class Absolute_val {
    public void absolute(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] < 0 && array[j] < 0) {
                array[i] = (-1 * array[i]);
                array[j] = (-1 * array[j]);
                i++;
                j--;
            } else if (array[i] > 0) {
                i++;
            } else if (array[j] > 0) {
                j--;
            }

        }

    }

}
