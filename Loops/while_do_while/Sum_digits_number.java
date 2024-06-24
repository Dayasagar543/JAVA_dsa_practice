package JAVA_dsa_practice.Loops.while_do_while;
import java.util.Scanner;

public class Sum_digits_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the number of your choice to know the sum");
        int num=sc.nextInt();
        int value=num;
        int sum=0,remainder;
        while(value!=0){
            remainder=value%10;
            value=value/10;
            sum+=remainder;
        }
        System.out.println("The sum of the digits input is "+sum);
        sc.close();
    }
    
}
