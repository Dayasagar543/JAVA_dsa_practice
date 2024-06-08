import java.util.Scanner;

public class Printing_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your percentage here");
        int percentage = sc.nextInt();
        if (percentage >= 91 && percentage <= 100) {
            System.out.println("excellent");
        } else if (percentage >= 81 && percentage <= 90) {
            System.out.println("very good");
        } else if (percentage >= 71 && percentage <= 80) {
            System.out.println("good");
        } else if (percentage >=61 && percentage <= 70) {
            System.out.println("can do better");
        } else if (percentage >= 51 && percentage <= 60) {
            System.out.println("average");
        } else if (percentage >= 41 && percentage <=50) {
            System.out.println("below average");
        } else {
            System.out.println("fail");
        }
        sc.close();

    }
}