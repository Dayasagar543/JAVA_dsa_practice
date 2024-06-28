package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

public class Swap_sum_differ {
    public void swap_sum_diff(int a, int b) {
        System.out.println("The values before manipulation");
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("values after the manipulation");
        System.out.println(a);
        System.out.println(b);
    }
}
