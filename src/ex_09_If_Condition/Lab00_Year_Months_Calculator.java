package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_Year_Months_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of days: ");
        int days = sc.nextInt();
        int numberOfYears = days / 365;
        int remainingDaysAfterYears = days % 365;
        int numberOfMonths = remainingDaysAfterYears / 30;
        int numberOfDays = remainingDaysAfterYears % 30;
        System.out.println(numberOfYears + " Years, " + numberOfMonths + " Months, " + numberOfDays + " Days");
        sc.close();
    }
}
