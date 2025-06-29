package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_DivisibleBy5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int a = sc.nextInt();

        int[] a = {54, 55, 110, 165, 220, 221};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0 && a[i] % 11 == 0) {
                System.out.println(a[i] + " Number is Divisible by 5 and 11");
            } else {
                System.out.println(a[i] + " Number is not Divisible by 5 and 11");
            }
        }
    }
}
