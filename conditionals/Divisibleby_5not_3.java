package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Divisibleby_5not_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if (val % 5 == 0 && val % 3 != 0) {
            System.out.println("the number is divisible by 5 but not threee");
        } else {
            System.out.println("divible by both");
        }
        sc.close();
    }

}
