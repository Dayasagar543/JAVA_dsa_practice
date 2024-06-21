package JAVA_dsa_practice.arrays;

public class Max_elements {

    int mAx() {
        int[] Max = { 1, 5,11,3 ,7,10};
        int max = 0;
        // for (int i = 0; i < Max.length; i++) {
        //     for (int j = i + 1; j < Max.length; j++) {
        //         if (max < Max[j]) {
        //             max = Max[j];
        //         }
        //     }

        // }
        for(int i=0;i<Max.length;i++){
            if(Max[i]>max){
                max=Max[i];
            }
        }
        return max;
    }

}
