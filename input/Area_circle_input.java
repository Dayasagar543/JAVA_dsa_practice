package JAVA_dsa_practice.input;
import java.util.Scanner;
public class Area_circle_input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the radius of the circle");
        int radius=sc.nextInt();
        double pi=Math.PI;
        double area =pi*radius*radius;
        System.out.println("the area of the circle is "+area);
        sc.close();
    }
}
