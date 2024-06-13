import java.util.Scanner;

public class Filled_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the length");
        int length=sc.nextInt();
        System.out.println("please input the width");
        int width=sc.nextInt();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=width;j++){
               System.out.print(" * "); 
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
