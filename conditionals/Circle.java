package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dist_center,radius;
        System.out.println("please input the radius");
        radius=sc.nextInt();
        System.out.println("please input the  point x1");
        int x1=sc.nextInt();
        System.out.println("please input the point y1");
        int y1=sc.nextInt();
        System.out.println("please input the  point x2");
        int x2=sc.nextInt();
        System.out.println("please input the point y2");
        int y2=sc.nextInt();
        dist_center=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        if ((dist_center * dist_center) < (radius * radius)) {
            System.out.println("The point is in side the circle");
        }
        if ((dist_center * dist_center) > (radius * radius)) {
            System.out.println("The point is out side the circle");
        }
        if ((dist_center * dist_center) == (radius * radius)) {
            System.out.println("The point is on the circle");
        }
        sc.close();
    }

}
