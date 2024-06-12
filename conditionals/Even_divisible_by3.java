package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Even_divisible_by3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input your age");
        int num=sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("the age is even and divisble by 3");
        }else if(num%5==0 ||num%3==0){
            System.out.println("the number is divisible either by 5 or 3");
        }
      sc.close();

    }
    
}
