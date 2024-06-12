package JAVA_dsa_practice.Loops.for_loop;

// import java.util.Scanner;

public class Multiples_5_7 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int num=1,counter=1;
        while(true){
            if(num%5==0 && num%7==0){
                System.out.println(num);
                counter++;
               if(counter>5){
                break;//break
               }

            }
            num++;
        }

    }
    
}
