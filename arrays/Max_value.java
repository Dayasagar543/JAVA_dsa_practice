package JAVA_dsa_practice.arrays;



public class Max_value {
    public int find_max(int[] array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        } 
        return max;
    }  
}