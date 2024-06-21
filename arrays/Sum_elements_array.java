package JAVA_dsa_practice.arrays;

public class Sum_elements_array {
    int sum() {
        // int[] arr = new int[3];
        int arr[]={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

}
