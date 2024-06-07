import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the length");
        int length=sc.nextInt();
        System.out.println("please input the width of the rectangle");
        int width =sc.nextInt();
        int Area,perimeter;
        Area =length*width;
        perimeter= 2*(length+width);
        Area=length*width;
        if(Area>perimeter){
            System.out.println("The area of the rectangle is greater "+"Area :"+ Area +" > "+"perimeter  "+ perimeter);
        }else if(Area<perimeter){
            System.out.println("the perimeter of the retangle is greater "+"Area : "+ Area +" < "+"perimeter "+ perimeter);
        }else {
            System.out.println("The area of the rectangle is equal to its perimeter "+"Area :"+ Area +" = "+"perimeter  "+ perimeter);
        }
        sc.close();
    }
    
}
