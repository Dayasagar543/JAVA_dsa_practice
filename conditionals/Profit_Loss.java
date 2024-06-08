package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the selling price");
        int selling_price=sc.nextInt();
        System.out.println("please input the cost price");
        int cost_price=sc.nextInt();
        if(selling_price>cost_price){
            System.out.println("made profit "+(selling_price-cost_price) +" rs");
        }
        else if(selling_price<cost_price){
            System.out.println("incurred loss "+(selling_price-cost_price) +"  rs" );
        }else{
            System.out.println("no profit no loss");
        }
        sc.close();
    }
}
