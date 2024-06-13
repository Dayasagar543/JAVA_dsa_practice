import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of your choice");
        int value = sc.nextInt();
        int num = value;
        int i = 1, result_factorial = 1;
        while (i <= num) {
            result_factorial=result_factorial*i;
            System.out.println("The factorial of "+ i+" is "+result_factorial);
            i++;
        }
        sc.close();
    }

}
