package JAVA_dsa_practice.converter;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the binary digits to know the decimal value of them");
        int binary_value=sc.nextInt();
        int ans=0;//converted decimal value
        int pw=1;//2^0=1
        while(binary_value!=0){
            int unit_digit=binary_value%10;
            ans+=(unit_digit*pw);
            binary_value/=10;
            pw*=2;
        }
        System.out.println(ans);
        sc.close();
    }
    
}
