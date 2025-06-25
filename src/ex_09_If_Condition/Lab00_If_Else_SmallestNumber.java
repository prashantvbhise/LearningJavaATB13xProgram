package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_If_Else_SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if (a<b && a<c){
            System.out.println("a is smallest");
        } else if (b<a && b<c){
            System.out.println("b is smallest");
        }else {
            System.out.println("c is smallest");
        }
    }
}
