package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Toddler_child {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input your age");
        int age =sc.nextInt();
        if(age<12){
            if(age<=5){
                System.out.println("Toddeler");
            }else{
                System.out.println("child");
            }
        }else{
            if(age<18 && age >=12){
                System.out.println("you are a teen ager");
            }else{
                System.out.println("you are an adult");
            }
        }
        sc.close();
    }
    
}
