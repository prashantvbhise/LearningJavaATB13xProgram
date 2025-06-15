package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab00_Ternary_Operator_GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Marks");
        int a = scanner.nextInt();

        // condition ? value_if_true : value_if_false;

        String results = (a >= 90) ? "A+"
                        :(a >= 75) ? "A"
                        :(a >= 60) ? "B"
                        :(a >= 40) ? "C"
                        :"Fail";
        System.out.println(results);

    }
}
