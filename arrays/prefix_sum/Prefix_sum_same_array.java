package JAVA_dsa_practice.arrays.prefix_sum;

public class Prefix_sum_same_array {
    public int [] sum_prefix(int[] array){
        for(int i=1;i<array.length;i++){
            array[i]=array[i-1]+array[i];
        }
        return array;
    }
    
}
