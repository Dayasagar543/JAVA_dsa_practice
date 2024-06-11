package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Straight_line {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the x1 point");
        double x1=sc.nextInt();
        System.out.println("please input the y1 point");
        double y1=sc.nextInt();
        System.out.println("please input the x2 point");
        double x2=sc.nextInt();
        System.out.println("please input the y2 point");
        double y2=sc.nextInt();
        System.out.println("please input the x3 point");
        double x3=sc.nextInt();
        System.out.println("please input the y3 point");
        double y3=sc.nextInt();
         
      double  m1=(y2-y1)/(x2-x1);
      double  m2=(y3-y2)/(x3-x2);

      if(m1==m2){
        System.out.println("the line is a straight line");
      }else{
        System.out.println("not a straight line");
      }
       
      sc.close();
    }
    
}
