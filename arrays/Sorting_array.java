package JAVA_dsa_practice.arrays;

public class Sorting_array {
    public boolean sort_arr(int[] arr) {
        boolean value = true;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 1; j < arr.length; j++) {
        //         if (arr[i] < arr[j]) {
        //             value=!value;
        //         }
                   
        //     }
        // }
        
        //above code can be used but optimised is below

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                value=!value;
                break;
            }
        }
        return value;
    }

}
