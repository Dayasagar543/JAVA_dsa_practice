package JAVA_dsa_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hellow world");
        // System.out.println(args[0]);
        Scanner sc =new Scanner(System.in);
        // System.out.println("input you fav number ");
        // int interger=sc.nextInt();//used to take integer input;
        // System.out.println("the number that you have input is" + interger);


        // System.out.println("input the name here");
        // String string=sc.next();//;used for taking string input but if 
        // there is a space then it will drop things after the space
        // System.out.println("hi there "+ string);


        System.out.println("please input your string here:  ");
        String sentence =sc.nextLine();
        System.out.println(sentence);
        sc.close();

    }
}