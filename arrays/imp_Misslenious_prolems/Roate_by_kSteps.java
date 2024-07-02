package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;



public class Roate_by_kSteps {
    public int[] rotateArray_k(int[] array,int k){
        int n=array.length;
        k=k%n;
       Inplace_array ia =new Inplace_array();
       ia.array_inplace(array,0,n-k-1);
       ia.array_inplace(array, n-k, n-1);
       ia.array_inplace(array, n-1, 0);
       return array;
    }
}
