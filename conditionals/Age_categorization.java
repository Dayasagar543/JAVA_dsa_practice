package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Age_categorization {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input your age");
        int numb=sc.nextInt();
        if(numb>=18){
            System.out.println("you are an adult");
        }else if(numb>=13 && numb< 18){
            System.out.println("you are a teen ager");
        }else{
            System.out.println("you are kid /child");
        }

    sc.close();
}
    
}
