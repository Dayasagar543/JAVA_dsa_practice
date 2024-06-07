import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int year=1900;
        Scanner sc =new Scanner(System.in);
        System.out.println("input the year to know if its a leap year or not");
        int input_year=sc.nextInt();
        if(input_year>=year && input_year %4==0){
            System.out.println("the year is a leap year");
        }else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
    
}
