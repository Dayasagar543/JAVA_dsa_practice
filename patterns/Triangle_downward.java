import java.util.Scanner;

public class Triangle_downward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the side of the triangle");
        int side_triagle = sc.nextInt();
        // for (int i = side_triagle; i>0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i <= side_triagle; i++) {
            for (int j = 1; j <=(side_triagle+1-i); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
