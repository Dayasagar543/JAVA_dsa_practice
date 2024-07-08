package JAVA_dsa_practice.arrays.two_pointers_arrray;

public class Square_num {
    public int[] square(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int[] arr=new int[array.length];
        int k=0;
        while (i <= j) {
            if (array[i] > array[j]) {
                arr[k++] = (array[i] * array[i]);
                i++;
            } else {
                arr[k++] = (array[j] * array[j]);
                j--;
            }
        }
        return arr;
    }
} 
