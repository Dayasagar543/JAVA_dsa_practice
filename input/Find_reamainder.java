package JAVA_dsa_practice.input;

import java.util.Scanner;

public class Find_reamainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dividend:");
        int dividend=sc.nextInt();
        System.out.println("enter the divisor:");
        int divisor=sc.nextInt();
        int quotient =dividend/divisor;
        int remainder=dividend-(divisor*quotient);
        System.out.println(remainder);
        sc.close();
    }
}
