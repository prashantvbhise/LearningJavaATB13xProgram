package ex_13_DoWhile;

import java.util.Scanner;

public class Lab00_DoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println("Vowels");
        } else if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Consonant");
        } else
        {
            System.out.println("Invalid Input");
        }


    }

}
