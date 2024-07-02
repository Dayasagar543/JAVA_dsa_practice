package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

public class Frequency_array {
    public int[] frequency_array(int[] array) {
        int[] freq = new int[1000005];
        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }
        return freq;
    }

}
