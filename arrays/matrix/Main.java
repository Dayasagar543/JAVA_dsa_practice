package JAVA_dsa_practice.arrays.matrix;

public class Main {
    public static void main(String[] args) {
        Spiral_traversal st = new Spiral_traversal();
        System.out.println("spiral of 5*5");
        int[][] array = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15
        }, { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 } };
        st.print_sprial(array,5,5);

        System.out.println();
        System.out.println("spiral of 4*4");
        int[][] array1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        st.print_sprial(array1,4,4);
    }

}
