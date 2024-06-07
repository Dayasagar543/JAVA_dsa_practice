package JAVA_dsa_practice.conditionals;
import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        System.out.println("enter a number to check if even or odd");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("This number is even");
        }else{
            System.out.println("This number is odd");
        }
        sc.close();

    }
    
}
