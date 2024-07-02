package JAVA_dsa_practice.arrays.imp_Misslenious_prolems;

import java.util.Scanner;

public class Query_user {
    public void query_freq_num(int query, int[] array) {
        Scanner sc = new Scanner(System.in);
        while (query > 0) {
            System.out.println("enter the number to be searched");
            int x = sc.nextInt();
            if (array[x] > 0) {
                System.out.println("yes " + array[x]);
            } else {
                System.out.println("no ");
            }
            query--;

        }
        sc.close();
    }
}
