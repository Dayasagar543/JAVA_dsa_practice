package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int val = sc.nextInt();

        String result = (val > 18) ? "adult" : "child";
        System.out.println("you are an  " + result);
        sc.close();
    }

}