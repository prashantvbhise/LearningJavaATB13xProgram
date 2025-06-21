package ex_12_While_loop;

import java.util.Scanner;

public class Lab00_While_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter positive number greater than 0");
        } else {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
