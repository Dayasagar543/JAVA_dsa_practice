package JAVA_dsa_practice.conditionals;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please input the selling price");
        int selling_price=sc.nextInt();
        System.out.println("please input the Buying price");
        int Buying_price=sc.nextInt();
        if(selling_price>Buying_price){
            System.out.println("profit "+(selling_price-Buying_price) );
        }
        else if(selling_price<Buying_price){
            System.out.println("loss "+(selling_price-Buying_price) );
        }else{
            System.out.println("no profit no loss");
        }
        sc.close();
    }
}
