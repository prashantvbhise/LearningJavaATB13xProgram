package ex_17_Arrays;

import java.util.Scanner;

public class Lab00_RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i =0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
