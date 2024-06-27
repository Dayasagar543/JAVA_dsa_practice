package JAVA_dsa_practice.arrays;

public class Find_firstRepeated {
    public int reapeated(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    return array[i];
                }
            }

        }
        return -1;
    }

}
