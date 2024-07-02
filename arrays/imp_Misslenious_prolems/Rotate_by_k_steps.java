package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

public class Rotate_by_k_steps {
    public int[] rotate_array   (int[] array, int k) {
        int n = array.length;
        k = k % n;
        int[] arr = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[j++] = array[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[j++] = array[i];
        }

        return arr;
    }
}
