package JAVA_dsa_practice.arrays;

import JAVA_dsa_practice.arrays.imp_Misslenious_prolems.*;
import JAVA_dsa_practice.arrays.imp_Misslenious_prolems.Swap_a_b;
import JAVA_dsa_practice.arrays.imp_Misslenious_prolems.Swap_sum_differ;

public class Main {
    public static void main(String[] args) {
        // arrays 1d
        Array ar = new Array();
        ar.demo_array();

        // arrays 2d
        D2_Array d2 = new D2_Array();
        d2.Array_2d();

        // sum array
        Sum_elements_array sm = new Sum_elements_array();
        System.out.println("the sum of the elements " + sm.sum());

        // max array
        Max_elements mx = new Max_elements();
        System.out.println("the max number in the list is " + mx.mAx());

        // index of number
        Find_number fn = new Find_number();
        System.out.println("The index of the number is  " + fn.find(7));

        // counting the number in the array
        Count_number cn = new Count_number();
        int[] arr2 = { 1, 2, 4, 6, 2, 7, 3, 2, 2, 5, 2, 6 };
        System.out.println("found the number  " + cn.count(arr2, 2) + " times  in the array");

        // last occuraces
        Last_occurance lc = new Last_occurance();
        System.out.println("The last occurances of the number in the array is " + lc.lastOccurance(arr2, 2));
        System.out.println("The last occurances of the number in the array is " + lc.lastOccurance(arr2, 10));

        // counting the numbers greateer than the input number
        Counting_greater_ele ce = new Counting_greater_ele();
        System.out.println("Counting the elements greater than the input value  " + ce.counting_ele_greater(arr2, 3));

        // checking if it is a sorted array or not
        int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr4 = { 1, 2, 5, 68, 3, 4, 5, 6, 7, 8, 9, 0 };
        Sorting_array sa = new Sorting_array();
        System.out.println("Is the array sorted " + sa.sort_arr(arr2));
        System.out.println("Is the array sorted " + sa.sort_arr(arr3));
        System.out.println("Is the array sorted " + sa.sort_arr(arr4));

        // finding the smallest and the largest
        Smallest__largest_ele se = new Smallest__largest_ele();// this line return an array memory adress so you need to
                                                               // collect into variable and loop over it
        for (int i : se.smallest_largest(arr4)) {
            System.out.println(i);
        }
        for (int i : se.smallest_largest(arr3)) {
            System.out.println(i);
        }

        // target sum of two numbers
        Target_sum ts = new Target_sum();
        System.out.println("The possiblities of target  " + ts.sum_target(arr4, 5));

        // target sum of three numbers
        Triplet_sum_target trs = new Triplet_sum_target();
        System.out.println("The possiblities of target of 3 numbers " + trs.sum_Triple(arr4, 9));
        int[] array5 = { 1, 4, 5, 6, 3 };
        System.out.println("The possiblities of target of 3 numbers " + trs.sum_Triple(array5, 12));

        int[] array6 = { 1, 2, 3, 4, 6, 4, 3, 2, 1 };
        Repeated rp = new Repeated();
        System.out.println("The non repeated number of the array  " + rp.repeated(array6));

        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // finding the second max value
        // Max_value mv = new Max_value();
        // int maximum = mv.find_max(array5);
        // Second_max smm = new Second_max();
        // System.out.println("The second maximum values is " + smm.second_max(array5,
        // maximum));

        // second max problem checking 2
        // int array7[] = { 1, 2, 3, 4, 7, 6, 4, 3, 2, 1 };
        // int maximum1 = mv.find_max(array7);
        // System.out.println("The second maximum values is " + smm.second_max(array7,
        // maximum1));

        int[] array8 = { 1, 2, 5, 6, 7, 8, 7, 29, 5, 5, 5, 4, 4, 5, 6, 6, 5, 4, 4, 4 };
        int[] array9 = { 1, 5, 3, 5, 6, 7, 8, 7, 29, 5, 5, 5, 4, 4, 3, 5, 6, 6, 5, 4, 4, 4 };
        Find_firstRepeated Fr = new Find_firstRepeated();
        System.out.println("The repeated number" + Fr.reapeated(array8));
        System.out.println("The repeated number" + Fr.reapeated(array9));

        // second smallest value

        // Min_value miv = new Min_value();
        // int minimum = miv.MinValue(array9);
        // Second_min smin = new Second_min();
        // System.out.println("The second min vlaue of the array is " +
        // smin.second_min(array9, minimum));
        // int minimum1 = miv.MinValue(array8);
        // System.out.println("The second min vlaue of the array is " +
        // smin.second_min(array8, minimum1));

        // swapping

        Swap_a_b sw = new Swap_a_b();
        sw.swap(3, 4);

        // swapping using the sum and difference method
        Swap_sum_differ smd = new Swap_sum_differ();
        smd.swap_sum_diff(5, 6);

        // reversing array
        // Reverse_array ra=new Reverse_array();
        // int [] R_array=ra.array_reverse(array9);
        // Print_array pr= new Print_array();
        // System.out.println("printing the input ar");
        // pr.print_array(array9);
        // System.out.println("Printing the Reversed array");
        // pr.print_array(R_array);

        // int[] array10 = { 1, 2, 3, 4, 5, 6 };
        // Inplace_array ia = new Inplace_array();
        // int[] inplace_reversed = ia.array_inplace(array10);
        // System.out.println("printing the array inplace");
        // for (int i : inplace_reversed) {
        // System.out.print(i+" ");
        // }
        // System.out.println();
        int[] array11 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // System.out.println("printing the input array 11");
        // for (int i : array11) {
        // System.out.print(i+ " ");
        // }
        // Rotate_by_k_steps rk= new Rotate_by_k_steps();
        // int [] arr=rk.rotate_array(array11, 1);
        // System.out.println("printing the rotated array");;
        // for (int i : arr) {
        // System.out.print(i+" ");
        // }
        // int [] arr_1=rk.rotate_array(array11, 5);
        // System.out.println("printing the rotated array");;
        // for (int i : arr_1) {
        // System.out.print(i+" ");
        // }
        Roate_by_kSteps rb = new Roate_by_kSteps();
        int[] array = rb.rotateArray_k(array11, 2);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("frequency of an element in array");
        int[] array12 = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 99, 9, 7, 6, 54, 3, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6, 5 };
        Frequency_array fa = new Frequency_array();
        int[] arrayf = fa.frequency_array(array12);
        Query_user Qu = new Query_user();
        Qu.query_freq_num(10, arrayf);
    }
}
