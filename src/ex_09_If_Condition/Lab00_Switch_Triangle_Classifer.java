package ex_09_If_Condition;

import java.util.Scanner;

public class Lab00_Switch_Triangle_Classifer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side 1");
        int side1 = scanner.nextInt();

        System.out.println("Enter Side 2");
        int side2 = scanner.nextInt();

        System.out.println("Enter Side 3");
        int side3 = scanner.nextInt();

        System.out.println(side1);
        System.out.println(side2);
        System.out.println(side3);

        /*if (side1 == (side2 = side3)) {
            System.out.println("equilateral");

            if (side1 != (side2 = side3)) {
                System.out.println("isosceles");
                }*/
        if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        }
        else if(side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }


    }
}

