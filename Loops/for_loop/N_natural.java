package JAVA_dsa_practice.Loops.for_loop;

import java.util.Scanner;

public class N_natural {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int val=sc.nextInt();
        for(int i=1;i<=val;i++){
            System.out.println(i);
        }
        sc.close();
    }
    
}
