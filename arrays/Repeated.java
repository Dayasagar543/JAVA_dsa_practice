package JAVA_dsa_practice.arrays;

public class Repeated {
    public int repeated(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                   array[i]=-1;
                   array[j]=-1;
                }
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i]!=-1){
                result=array[i];
            }
            // System.out.println(array[i]);
        }
        return result;
    }

}
