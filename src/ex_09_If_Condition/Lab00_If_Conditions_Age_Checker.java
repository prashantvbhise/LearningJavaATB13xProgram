package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_If_Conditions_Age_Checker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("you are minor");
        }

    }
}
