package JAVA_dsa_practice.Loops.while_do_while;

import java.util.Scanner;

public class Sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int number = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }

}
