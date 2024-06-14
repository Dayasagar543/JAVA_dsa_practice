import java.util.Scanner;

public class Hallow_trianglular_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=sc.nextInt();
        for(int i =1;i<=value;i++){
            for(int j=1;j<=value-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2-1);k++){
            if(i==1||k==1||i==value||k==(i*2-1)){
                System.out.print(i);
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
        sc.close();
    }

}
