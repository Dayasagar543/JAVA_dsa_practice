import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_rectangle = sc.nextInt();
        System.out.println("provide the side of the rectangle");
        for (int i = 1; i <= number_rectangle; i++) {
            for (int j = 1; j <=number_rectangle; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}