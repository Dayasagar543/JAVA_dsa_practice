package JAVA_dsa_practice.arrays.two_pointers_arrray;

import JAVA_dsa_practice.arrays.imp_Misslenious_prolems.Inplace_array;

public class Sorting_array_swap_2_pointer {
    public void two_pointer_swap_array(int[] array) {
        Inplace_array ia = new Inplace_array();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
           if(array[i]==1&&array[j]==0){
            ia.swap_in_array(array, i, j);
            i++;
            j--;
           }else if(array[i]==0){
            i++;
           }else if(array[j]==1){
            j--;
           }
            
            
        }

    }
}
