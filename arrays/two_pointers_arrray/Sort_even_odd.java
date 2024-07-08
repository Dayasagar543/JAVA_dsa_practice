package JAVA_dsa_practice.arrays.two_pointers_arrray;

import JAVA_dsa_practice.arrays.imp_Misslenious_prolems.Inplace_array;

public class Sort_even_odd {
    public void sort_even_odd(int[] array) {
        Inplace_array ia = new Inplace_array();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] % 2 != 0 && array[j] % 2 == 0) {
                ia.swap_in_array(array, i, j);
                i++;
                j--;
            }else if(array[i]%2==0){
                i++;
            }else if(array[j]%2!=0){
                j--;
            }

        }
    }

}
