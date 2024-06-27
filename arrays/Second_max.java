package JAVA_dsa_practice.arrays;

public class Second_max {
    public int second_max(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
               array[i]=Integer.MIN_VALUE;
            }
        }
        
        Max_value mv = new Max_value();
        int second_max = mv.find_max(array);
        return second_max;
    }
}
