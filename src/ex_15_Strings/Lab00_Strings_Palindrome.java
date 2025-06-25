package ex_15_Strings;

import java.util.Scanner;

public class Lab00_Strings_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.next().toLowerCase();
        StringBuffer s1 = new StringBuffer(s);
        String s2 =s1.reverse().toString().toLowerCase();
        if (s.equals(s2)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        };

    }
}
