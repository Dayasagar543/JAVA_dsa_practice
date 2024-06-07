package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Divisibleby_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :  ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("the number you enterd is divisible by 5");
        } else {
            System.out.println("not divible by 5");
        }
        sc.close();
    }

}
