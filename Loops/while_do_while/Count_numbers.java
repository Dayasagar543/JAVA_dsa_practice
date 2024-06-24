package JAVA_dsa_practice.Loops.while_do_while;
import java.util.Scanner;

public class Count_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of your choice");
        int num = sc.nextInt();
        int value=num;
        int i = 0;
        while (value != 0) { //can use the condition value>0
            value = value / 10;
            // System.out.println(value);
            i++;
        }
        System.out.println("The number of digits in giver number "+num+" "+i);
        sc.close();
    }

}
