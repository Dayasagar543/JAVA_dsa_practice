package JAVA_dsa_practice.input;

import java.util.Scanner;

public class Sumof2numbers {
    public static void main(String[] args) {
        System.out.println("please input 2 numbers for the sume");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter first second");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("the sum of 2 numbers is " +c);
        sc.close();
    }
}

