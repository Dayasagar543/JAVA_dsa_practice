package JAVA_dsa_practice.Loops.while_do_while;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("input the base ");
        int base=sc.nextInt();
        System.out.println("input the power");
        int power=sc.nextInt(),result=1;

        for(int i=1;i<=power;i++){
            result*=base;
        }
        System.out.println( base+" the power of "+power+" is "+result);
        sc.close();
    }

    
}
