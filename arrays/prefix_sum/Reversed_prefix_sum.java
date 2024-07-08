package JAVA_dsa_practice.arrays.prefix_sum;

public class Reversed_prefix_sum {

    public int[] reversed_prefixsum(int[] array){
        for(int i=array.length-1;i>0;i--){
            array[i-1]=array[i-1]+array[i];
        }
        return array;
    }
    
}
