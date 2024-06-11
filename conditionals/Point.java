package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the x-axis");
        int x=sc.nextInt();
        System.out.println("please input the Y-axis");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("the point lines on the origin");
        }else if(x==0 && y !=0){
            System.out.println("the point lies on x-axis");
        }else if(y==0 && x!=0){
            System.out.println("the point lies on y-axis");
        }else{
            System.out.println("point donot  lie on the axies or the origin");
        }
        sc.close();
    }
    
}
