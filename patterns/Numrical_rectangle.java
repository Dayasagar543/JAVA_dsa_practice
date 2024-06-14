import java.util.Scanner;

public class Numrical_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the side of the rectangle");
        int rectangle_patter_num = sc.nextInt();
        for (int i = 1; i <= rectangle_patter_num; i++) {
            for (int j = i; j <= rectangle_patter_num; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        sc.close();
    }

}
