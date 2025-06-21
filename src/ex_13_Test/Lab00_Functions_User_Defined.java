package ex_13_Test;

import java.util.Scanner;

public class Lab00_Functions_User_Defined {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of X");
        int x = sc.nextInt();
        System.out.println("Enter Value of Y");
        int y = sc.nextInt();
        greeting();
        printName();
        addNumber(x, y);
        subtarctNumber(x, y);

    }

    static void greeting() { // user-defined function without Parameters and Without Return Type
        System.out.println("This is user-defined function without Parameters and Without Return Type *** Greeting for the Day");
    }

    static void addNumber(int a, int b) { // user-defined function with Parameters and Without Return Type
        int c = a + b;
        System.out.println("This is user-defined function with Parameters and Without Return Type *** Addition = " + c);
    }

    static String printName() {
        System.out.println("This is user-defined function without Parameters and With Return Type");// user-defined function without Parameters and With Return Type
        return "This is user-defined function without Parameters and With Return Type";

    }

    static int subtarctNumber(int d, int e) { // user-defined function with Parameters and With Return Type
        System.out.println("This is user-defined function with Parameters and With Return Type *** Subtraction = " + (d - e));
        return d - e;

    }


}
