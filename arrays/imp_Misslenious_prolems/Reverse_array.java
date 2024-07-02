package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

public class Reverse_array {
    public int[] array_reverse(int[] array) {
        int[] array1 = new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >=0; i--) {
          array1[j++]=array[i];//this is optimised
        }
        return array1;
    }

}
