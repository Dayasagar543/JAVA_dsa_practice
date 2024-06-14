import java.util.Scanner;

public class Upward_numberical_patter {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please input the height of triangle");
    int value =sc.nextInt();
    for(int i=1;i<=value;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    sc.close();
    }
    
}
