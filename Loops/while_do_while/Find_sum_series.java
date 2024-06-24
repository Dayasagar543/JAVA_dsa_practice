package JAVA_dsa_practice.Loops.while_do_while;
import java.util.Scanner;

public class Find_sum_series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input the number of your choice");
        int user_number=sc.nextInt();
        int i=1,sum=0;
        while(i<=user_number){
            if(i%2==0){
                sum=sum-i;
            }else{
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
