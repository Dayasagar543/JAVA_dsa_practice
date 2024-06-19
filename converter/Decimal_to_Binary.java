package JAVA_dsa_practice.converter;

import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a number to now the binary values");
        int Decimal_num = sc.nextInt();
        int value = Decimal_num;
        int result = 0;// answer of binary as output
        int power = 1;// powers of ten
        int parity = 0;
        while (value != 0) {
            parity=value%2;
            result=result+(parity*power);
            value/=2;
            power *= 10;
        }
        System.out.println(result);
        sc.close();
    }

}
