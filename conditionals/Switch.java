package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  the favourite day of the week");
    int val=sc.nextInt();
    switch(val){
        case 0:
            System.out.println("sunday");
            break;
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        default: 
            System.out.println("wrong input");
            break;
            
        }
        sc.close();
  }  
}
