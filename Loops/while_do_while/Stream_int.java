package JAVA_dsa_practice.Loops.while_do_while;

import java.util.Scanner;

public class Stream_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("please input the number of your choice");
            int val = sc.nextInt();
            if (val == -1) {
                flag=false;
                System.out.println("the sum is  "+sum);
                break;//break
            } else {
                sum = sum + val;
                System.out.println(sum); 
            }
        }
        sc.close();

    }

}
