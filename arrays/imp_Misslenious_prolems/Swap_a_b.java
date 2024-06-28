package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

public class Swap_a_b {
    public void swap(int a, int b) {
        // int array[] = new int[2];
        int c = 0;
        System.out.println("values before swapping");
        System.out.println(b);
        System.out.println(a);
        c = a;
        a = b;
        b = c;
        System.out.println("values after swapping");
        System.out.println(b);
        System.out.println(a);
        // array[0] = a;
        // array[1] = b;
        // return array;
    }

}
