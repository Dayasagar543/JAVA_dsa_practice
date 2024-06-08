package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Can_triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the sides of triangle");
        int side1,side2,side3;
        System.out.println("input side1");
        side1=sc.nextInt();
        System.out.println("input side2");
        side2=sc.nextInt();
        System.out.println("input side3");
        side3=sc.nextInt();
        if((side1+side2)>side3 && (side2+side3)>side1 && (side3+side2)>side2){
            System.out.println("the construction of triangle is possible ");
        }else{
            System.out.println("the construction of triangle is not possible");
        }
        sc.close();
    }
    
}
