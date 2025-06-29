package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_Age_Checker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>0 && age<=12){
            System.out.println("You are Child");
        } else if (age>=13 && age<=19) {
            System.out.println("You are Teenager");
        }else if (age>=20 && age<=64) {
            System.out.println("You are Adult");
        }else {
            System.out.println("You are Senior Citizen");
        }
    }
}
