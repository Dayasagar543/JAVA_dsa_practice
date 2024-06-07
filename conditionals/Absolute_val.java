package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Absolute_val {
    public static void main(String[] args) {
        System.out.println("please input a number to know its absolute val");
        Scanner sc = new Scanner(System.in);
        int val =sc.nextInt();
        if(val<0){
           val=val*(-1);
            System.out.println("The absolute value of the number is "+val);
        }else{
            System.out.println("The absolute value of the val is "+ val);
        }
        sc.close();

    }
    
}
