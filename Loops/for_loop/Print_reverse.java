package JAVA_dsa_practice.Loops.for_loop;

import java.util.Scanner;

public class Print_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int number=sc.nextInt();
        //int i=number //you can initialize this also 
        for(int i=number;i>=0;i-=5){//i+=//i-=//i*=
            System.out.println(i);
            //i+=5 //can write the coniditon here also but semi colons are mandatory and 
            //and also condition can be optional tooo..
        }
        sc.close();
    }
    
}
