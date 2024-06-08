package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Divisibleby_3_5notby15 {
    public static void main(String[] args) {
        System.out.println("please input a numbers");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // if((num % 5==0 || num % 3==0 )&& num % 15 !=0){
        // System.out.println("the number is divisible 3 or 5 but not 15");
        // }else{
        // System.out.println("the number is divisible by 3,5,15");
        // }
        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println("the number is divisible by either 5 or 3");
            if (num % 15 != 0) {
                System.out.println("the number is not divisible by 15");
            } else {
                System.out.println("the number is divisible by 15");
            }
        } else {
            System.out.println("the number is divisible by none ");
        }

        sc.close();
    }

}
