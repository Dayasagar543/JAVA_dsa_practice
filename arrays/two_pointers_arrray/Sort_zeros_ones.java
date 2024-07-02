package JAVA_dsa_practice.arrays.two_pointers_arrray;

public class Sort_zeros_ones {
    public void sort_nums(int array[]) {
        int zeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i < zeros) {
                array[i] = 0;
            }else{
                array[i]=1;
            }
        }

    }

}
