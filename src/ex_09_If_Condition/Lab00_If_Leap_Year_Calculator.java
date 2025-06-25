package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_If_Leap_Year_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit Year");
        int year = sc.nextInt();

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
