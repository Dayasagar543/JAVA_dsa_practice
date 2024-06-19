package JAVA_dsa_practice;

import java.util.Scanner;

import JAVA_dsa_practice.Function.Arthematic;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hellow world");
        // System.out.println(args[0]);
        Scanner sc = new Scanner(System.in);
        // System.out.println("input you fav number ");
        // int interger=sc.nextInt();//used to take integer input;
        // System.out.println("the number that you have input is" + interger);

        // System.out.println("input the name here");
        // String string=sc.next();//;used for taking string input but if
        // there is a space then it will drop things after the space
        // System.out.println("hi there "+ string);

        System.out.println("please input your string here:  ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
        sc.close();

        // Functions
        Arthematic ad = new Arthematic();
        Arthematic ad1 = new Arthematic(4, 5);
        System.out.println("the modulus " + ad1.mod(20, 30));
        System.out.println("the modulus " + ad1.mod(20, 3));
        System.out.println(ad.add(1, 2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.floor(2.3));
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.max(27, 30));
        System.out.println(Math.min(50, 30));

    }
}