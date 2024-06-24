package JAVA_dsa_practice.Loops.while_do_while;
import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int num = sc.nextInt();

        // below is the method we used string to add the moduled number;

        // int value=num,remainder=0;
        // String pop_num="";
        // while(value!=0){
        // remainder=value%10;
        // value=value/10;
        // pop_num+=remainder;
        // }
        // System.out.println(pop_num);



        //we can also use the other method too
        int value=num,remainder=0,reversed=0;
        while(value!=0){
            remainder=value%10;
            value=value/10;
            
            //logic
            reversed=reversed*10+remainder;
        }
        System.out.println(reversed);
        sc.close();
    }

}
