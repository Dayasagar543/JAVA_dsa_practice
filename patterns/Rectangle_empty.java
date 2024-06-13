

import java.util.Scanner;

public class Rectangle_empty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the length");
        int length=sc.nextInt();
        System.out.println("please input the width");
        int width=sc.nextInt();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=width;j++){
                if(i==1 ||j==1 || i==length || j==width){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
