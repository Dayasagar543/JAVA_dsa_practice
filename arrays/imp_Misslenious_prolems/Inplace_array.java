package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

public class Inplace_array {

    public void swap_in_array(int[] array, int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];

    }

    public int[] array_inplace(int[] array,int i,int j) {
        // int i , j = array.length - 1;
        while (i < j) {
            swap_in_array(array, i, j);
            i++;
            j--;
        }

        // for(i=0;i<j;i++){
        //     swap_in_array(array, i, j);
        //     j--;
        // }

        return array;
    }

}
