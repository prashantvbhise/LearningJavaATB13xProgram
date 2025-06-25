package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_If_PrimeNumber {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if (a % a == 0) {
            System.out.println(a +"  is prime number");
        }else {
            System.out.println(a +" is not a prime number");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime Number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is NOT a Prime Number.");
            }
        }
    }
}
