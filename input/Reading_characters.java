package JAVA_dsa_practice.input;

import java.util.Scanner;

public class Reading_characters {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to print the 1st charaacter of the string ");
        char first_letter =sc.next().charAt(0);
        System.out.println("Enter string to print 3 rd character of string ");
        char third_letter =sc.next().charAt(2);//reading 3rd char as per the indexing
        System.out.println(first_letter);
        System.out.println(third_letter);
        
        sc.close();
    }
}
