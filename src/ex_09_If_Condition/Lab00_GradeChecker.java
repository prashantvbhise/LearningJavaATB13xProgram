package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int a = sc.nextInt();

        if (a > 0 && a <= 100) {
            if (a >= 90 & a <= 100) {
                System.out.println(a + " = A+ Grade");
            }
            else if (a >= 80 & a <= 89) {
                System.out.println(a + " = A Grade");
            }
            else if (a >= 70 & a <= 79) {
                System.out.println(a + " = B Grade");
            }
            else if (a >= 60 & a <= 69) {
                System.out.println(a + " = C Grade");
            }
            else if (a >= 50 & a <= 59) {
                System.out.println(a + " = D Grade");
            }
            else if (a >= 40 & a <= 49) {
                System.out.println(a + " = E Grade");
            }
            else {
                System.out.println("You are Fail");
            }
        }
    }
}
