package JAVA_dsa_practice.arrays.two_pointers_arrray;

import JAVA_dsa_practice.arrays.Print_array;

public class Main {
    public static void main(String[] args) {
        Print_array pa=new Print_array();


        //Sorting elements of 0 and 1 in the array

        // Sort_zeros_ones sz = new Sort_zeros_ones();
        int []array_z_0={0,1,0,1,0,0,0,1,1,1,0,1,0,0,1,1,1,0};
        System.out.println("printing the array before sort");
        // pa.print_array(array_z_0);
        // sz.sort_nums(array_z_0);
        // System.out.println("printing the array after the sort");
        // pa.print_array(array_z_0);
        
        //sorting elements using the 2 pointers
        pa.print_array(array_z_0);
        Sorting_array_swap_2_pointer sa=new Sorting_array_swap_2_pointer();
        System.out.println("sorting elements using the 2 pointers");
        sa.two_pointer_swap_array(array_z_0);
        pa.print_array(array_z_0);
        
    }
    
}
