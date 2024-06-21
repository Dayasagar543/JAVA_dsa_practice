package JAVA_dsa_practice.arrays;

public class D2_Array {

    void Array_2d() {
        // int[][] multidi_array = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6,
        // 7 } };// array literal
        // System.out.println(multidi_array[0][0]);
        // System.out.println(multidi_array[0][1]);
        // System.out.println(multidi_array[0][2]);
        // System.out.println(multidi_array[0][3]);
        // System.out.println(multidi_array[0][4]);
        // System.out.println(multidi_array[1][0]);
        // System.out.println(multidi_array[1][1]);
        // System.out.println(multidi_array[1][2]);
        // System.out.println(multidi_array[1][3]);
        // System.out.println(multidi_array[1][4]);
        // System.out.println(multidi_array[2][0]);
        // System.out.println(multidi_array[2][1]);
        // System.out.println(multidi_array[2][2]);
        // System.out.println(multidi_array[2][3]);
        // System.out.println(multidi_array[2][4]);

        int[][] nums = new int[3][3];
        // nums[0][0] = 2;
        // nums[0][1] = 2;
        // nums[0][2] = 2;
        // nums[1][0] = 2;
        // nums[1][1] = 2;
        // nums[1][2] = 2;
        // nums[2][0] = 27;
        // nums[2][1] = 2;
        // nums[2][2] = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                double val = Math.random() * 10;
                nums[i][j] = (int) val;
            }
            System.out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        int[][] values = new int[3][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                values[i][j] = nums[j][i];
            }
        }

        System.out.println("printing the changed index arrayas \n");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(values[i][j] + "  ");
            }
            System.out.println();
        }

        
    }

}
