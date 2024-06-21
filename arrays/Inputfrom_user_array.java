package JAVA_dsa_practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputfrom_user_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Print_array pa = new Print_array();
        System.out.println("Input size of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Input " + n + " of the array ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("printing the input array");
        pa.print_array(array);

        System.out.println("printing from the copied array or referenced array");
        //int[] arr_2 = array.clone();//.clone method enables deep copy of the array
        int[] arr_2 = Arrays.copyOf(array, array.length);//.clone method enables deep copy of the array
        arr_2[1]=23;
        arr_2[4]=34;
        pa.print_array(array  );
       System.out.println("printing after altering the values at indexes" );
       pa.print_array(arr_2);
        sc.close();
    }

}
