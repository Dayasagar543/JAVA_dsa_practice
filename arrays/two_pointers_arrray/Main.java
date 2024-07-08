package JAVA_dsa_practice.arrays.two_pointers_arrray;

import java.util.Scanner;

import JAVA_dsa_practice.arrays.Print_array;
import JAVA_dsa_practice.arrays.imp_Misslenious_prolems.Reverse_array;
import JAVA_dsa_practice.arrays.prefix_sum.Prefix_sum_same_array;
import JAVA_dsa_practice.arrays.prefix_sum.Reversed_prefix_sum;

public class Main {
    public static void main(String[] args) {
        Print_array pa = new Print_array();

        // Sorting elements of 0 and 1 in the array

        // Sort_zeros_ones sz = new Sort_zeros_ones();
        int[] array_z_0 = { 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
        System.out.println("printing the array before sort");
        // pa.print_array(array_z_0);
        // sz.sort_nums(array_z_0);
        // System.out.println("printing the array after the sort");
        // pa.print_array(array_z_0);

        // sorting elements using the 2 pointers
        pa.print_array(array_z_0);
        Sorting_array_swap_2_pointer sa = new Sorting_array_swap_2_pointer();
        System.out.println("sorting elements using the 2 pointers");
        sa.two_pointer_swap_array(array_z_0);
        pa.print_array(array_z_0);

        int[] array_e_o = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 92, 3, 4, 4, 51, 3 };
        System.out.println("printing the even or numbers");
        pa.print_array(array_e_o);
        Sort_even_odd seo = new Sort_even_odd();
        seo.sort_even_odd(array_e_o);
        System.out.println("printing after the sort");
        pa.print_array(array_e_o);

        int[] array_sq = { -9, -1, 3, 4, 5, 6, 7 };
        Absolute_val av = new Absolute_val();
        av.absolute(array_sq);
        System.out.println("printing absolute array");
        pa.print_array(array_sq);

        Square_num sn = new Square_num();
        int[] vlaues = sn.square(array_sq);
        System.out.println("printing the squares");
        for (int i : vlaues) {
            System.out.print(i + " ");
        }
        System.out.println();
        Reverse_array ra = new Reverse_array();
        System.out.println("printing the in non-decreasing values");
        int[] rev_arr = ra.array_reverse(vlaues);
        for (int i : rev_arr) {
            System.out.print(i + " ");
        }

        // prefix array
        int[] array_sp = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("printing the array before the prefix sum");
        pa.print_array(array_sp);
        Prefix_sum_same_array ps = new Prefix_sum_same_array();
        ps.sum_prefix(array_sp);
        System.out.println("printing the array after the prefix sum");
        pa.print_array(array_sp);

        // printing the sum of the values in the array using prefix sum
        int[] array_spo = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr = new int[array_spo.length - 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = array_spo[i];
        }
        // Prefix_sum_same_array pfs = new Prefix_sum_same_array();
        // int[] outprf = pfs.sum_prefix(arr);
        Scanner sc = new Scanner(System.in);
        // System.out.println(" please input the number of queries ");
        // int queries_num = sc.nextInt();
        // while (queries_num-- > 0) {
        //     System.out.println("input the first value of the range");
        //     int first_value = sc.nextInt();
        //     System.out.println("input the second value of the range");
        //     int second_value = sc.nextInt();
        //     int sum = outprf[second_value] - outprf[first_value - 1];
        //     System.out.println("The sum is " + sum);
        // }

        int array_sum_reversed[] = { 1, 2, 3, 4, 5, 6 };
        Reversed_prefix_sum rp = new Reversed_prefix_sum();
        System.out.println("printing the reversed sum array values");
        int[] rev_ar_sum = rp.reversed_prefixsum(array_sum_reversed);
        for (int i : rev_ar_sum) {
            System.out.print(i+" ");
        }

        sc.close();
    }

}
