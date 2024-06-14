import java.util.Scanner;

public class Even_odd_patter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("provide the side of the pyramid");
        int val=sc.nextInt();
        for(int i=1;i<=val;i++){
            for(int j=1;j<=val;j++){
               if((i+j)%2==0){
                System.out.print(" 1 ");
               }else{
                System.out.print(" 2 ");
               }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
