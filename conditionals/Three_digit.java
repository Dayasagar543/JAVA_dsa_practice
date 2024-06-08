package JAVA_dsa_practice.conditionals;
import java.util.Scanner;

public class Three_digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to know if 3 digit number");
        int number=sc.nextInt();
        if(number>99 && number <1000 ){
            System.out.println("The number is a 3 digit number");
        }else{
            System.out.println("not a 3 digit number");
        }
        sc.close();
    }
    
}
