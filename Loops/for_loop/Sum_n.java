package JAVA_dsa_practice.Loops.for_loop;

import java.util.Scanner;

public class Sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }

}
