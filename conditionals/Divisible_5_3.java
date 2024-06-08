package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Divisible_5_3 {
    public static void main(String[] args) {
        System.out.println("please input a numbers");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if(num % 5==0 && num % 3==0){
            System.out.println("the number is divisible by both numbers");
        }else{
            System.out.println("not divisible by both numbers");
        }
        sc.close();
    }
    
}
