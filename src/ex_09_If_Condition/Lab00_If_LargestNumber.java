package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_If_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to compare");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a +" is bigger number");
        }else {
            System.out.println(b +" is bigger number");
        }
    }

}
