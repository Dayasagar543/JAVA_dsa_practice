package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the age of first person");
        int person1 = sc.nextInt();
        System.out.println("please input the age of second person");
        int person2 = sc.nextInt();
        System.out.println("please input the age of third person");
        int person3 = sc.nextInt();
        // if (person1 < person2 && person1 < person3) {
        // System.out.println("person1 is younger " + person1);
        // } else if (person2 < person3) {
        // System.out.println("person2 is younger " + person2);
        // } else {
        // System.out.println("person3 is younger " + person3);
        // }

        if (person1 < person2) {
            if (person1 < person3) {
                System.out.println("person 1 is younger " + person1);
            } else {
                System.out.println("person 3 is younger " + person3);
            }
        } else {
            if (person2 < person3) {
                System.out.println("person 2 is younger " + person2);
            } else {
                System.out.println("person 3 is younger " + person3);
            }
        }
        sc.close();

    }

}
