package JAVA_dsa_practice.Basics;

public class Bitwise_operator {
    public static void main(String[] args) {

        //bitwise operators

        //bitwise or operator
        System.out.println(9|10);
            //explanation : decimals are converted into bits ,
            // or operation is performed on it.
            //  decimal               binary
            //   9       --------->  1 0 0 1
            //   10      --------->  1 0 1 0
            //                       1 0 1 1

         //bitwise and operator
        System.out.println(9&10);
         //explanation : decimals are converted into bits ,
            // and  operation is performed on it.
            //  decimal               binary
            //   9       --------->  1 0 0 1
            //   10      --------->  1 0 1 0
            //                       1 0 0 0
        
        //bitwise xor operator
        System.out.println(9^10);
         //explanation : decimals are converted into bits ,
            // xor  operation is performed on it.
            //in xor the bits are manupulated in such a way when they are
            //same they are the result will be 1 and if different it will be 0
            //  decimal               binary
            //   9       --------->  1 0 0 1
            //   10      --------->  1 0 1 0
            //                       0 0 1 1

        //bitwise ~ compliment operator
        System.out.println("the compliment of "+ ~10);//5
        //explanation : decimals are converted into bits ,
            //  compliment operation is performed on it.
            //in compliment the bits are inverted i.e 0 is turned 1 and 1 is 
            //turned to 0
            //  decimal               binary
            
            //   10      --------->  1 0 1 0
            //  result               0 1 0 1 ---------> -11 as it is subtracting it form the before memory block 

        System.out.println(10<<1);//20
         //explanation : decimals are converted into bits ,
            // left shift operation is performed on it.
            //in left shift the bits are  shifted leftward based on the 
            //number given after the left shift symbol
            //  decimal               binary              shifted value
            
             //   10      --------->  1 0 1 0   --------->  1 0 1 0 0  ---> 20

        System.out.println(10>>1);//5
        //explanation : decimals are converted into bits ,
            // right shift operation is performed on it.
            //in right shift the bits are  shifted rightward based on the 
            //number given after the right shift symbol and here the bits are dropped as it moves toward right
            //  decimal               binary              shifted value
            
             //   10      --------->  1 0 1 0   --------->  1 0 1  ---> 5



        
    }
    
}
