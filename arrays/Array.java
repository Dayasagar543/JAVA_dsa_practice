package JAVA_dsa_practice.arrays;

public class Array {

    void demo_array() {
        int age[] = { 1, 2, 3, 5 };// literal arrray can write n number of element size is not a contrant here
        String names[] = new String[5];
        int numi[] = new int[5];
        float numf[] = new float[5];

        numi[0] = 34;
        numi[1] = 2;
        numi[2] = 54;
        numi[3] = 76;

        numf[0] = 34f;
        numf[1] = 23f;
        numf[2] = 65f;
        numf[3] = 67f;

        for (int i = 0; i < numi.length; i++) {
            System.out.println("The value at index " + i + " = " + numi[i]);
        }
        System.out.println();
        System.out.println("printing the float values");
        System.out.println("--------------------------- \n");

        for (int i = 0; i < numf.length; i++) {
            System.out.println("The value at index " + i + " = " + numf[i]);
        }
        System.out.println("printing using foreach");
        for (float f : numf) {
            System.out.println(f);
        }
    }
}
