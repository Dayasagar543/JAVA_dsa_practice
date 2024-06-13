

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the number of your choice");
        int number = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <=number);
        sc.close();
    }

}
