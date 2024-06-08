package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Greatest_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input number 1");
        int number1=sc.nextInt();
        System.out.println("please input number 2");
        int number2=sc.nextInt();
        System.out.println("please input number 3");
        int number3=sc.nextInt();
        if(number1>number2 && number1 >number3){
            System.out.println("first number is greatest "+number1 );
        }else if(number2>number3){
            System.out.println("second number is greater " +number2);
        }else{
            System.out.println("the third number is greater "+number3);
        }
        
        sc.close();
    }
    
}
