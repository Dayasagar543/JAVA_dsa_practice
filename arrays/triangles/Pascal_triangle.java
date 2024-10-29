package JAVA_dsa_practice.arrays.triangles;

public class Pascal_triangle {
    public void Pas_triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print( " * " );
            }
            System.out.println();
        }

    }

}
