package JAVA_dsa_practice.arrays;

public class Find_number {
    int find(int val){
        int arr[]={1,256,7,8,9,65,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i ;
            }
        }
        return -1;
    }
    
}
