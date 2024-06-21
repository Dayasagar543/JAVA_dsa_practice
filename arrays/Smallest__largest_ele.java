package JAVA_dsa_practice.arrays;

public class Smallest__largest_ele {
    public int[] smallest_largest(int[] arr) {
        int smallest = arr[0], largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        int[] values = {smallest,largest};
        return values;
    }

}
