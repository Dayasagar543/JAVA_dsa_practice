package JAVA_dsa_practice.input;

import java.util.Scanner;

public class Modulo_operator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the numbers to calculate modulous ");
        int a= sc.nextInt();
        System.out.println("Input the numbers to calculate modulous ");
        int b=sc.nextInt();
        int c=a%b;
        System.out.println("the modulus of the inputs is " +c);
        sc.close();
    }
}
