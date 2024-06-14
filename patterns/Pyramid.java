import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("provide the side of the pyramid");
        int Pyramid_height = sc.nextInt();
        for (int i = 1; i <= Pyramid_height; i++) {// travesing rows
            // print r-i spaces
            for (int j = 1; j <=Pyramid_height-i; j++) {
                System.out.print(' ');
            }
            //print 2i-1
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}
