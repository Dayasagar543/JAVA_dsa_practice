package JAVA_dsa_practice.arrays.triangles;

public class Pascal_triangle {
    public int[][] Pas_triangle(int n) {
        int[][] array = new int[n][];
        for (int i = 0; i < array.length; i++) {
            array[i]=new int[i+1];
            array[i][0]=array[i][i]=1;
            for (int j = 1; j < i; j++) {
                array[i][j]=array[i-1][j]+array[i-1][j-1];
            }  
        }

        // printing the triangle
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

}
