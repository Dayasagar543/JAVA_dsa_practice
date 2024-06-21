package JAVA_dsa_practice.arrays;

public class Counting_greater_ele {
    public int counting_ele_greater(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > val) {
                count++;
            }
        }
        return count;
    }

}
