package JAVA_dsa_practice.arrays;

public class Last_occurance {
    public int lastOccurance(int[] arr, int val) {
        // int lastoccr = 0;
        int lastoccr = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                lastoccr=i;
            }
        }
        // if(lastoccr!=0){
        //     return lastoccr;
        // }else{
        //     return -1;
        // }
        return lastoccr;
        //the above code is  optimise and we can do using the commented code too.
    }

}
