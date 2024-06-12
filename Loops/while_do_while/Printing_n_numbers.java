package JAVA_dsa_practice.Loops.while_do_while;

import java.util.Scanner;

public class Printing_n_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int number=sc.nextInt();
        int i=0;
        while(i<=number){
            System.out.println(i);
            i++;
        }
        
        sc.close();
    }
    
}
