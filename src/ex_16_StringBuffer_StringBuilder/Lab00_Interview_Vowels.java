package ex_16_StringBuffer_StringBuilder;

import java.util.Locale;
import java.util.Scanner;

public class Lab00_Interview_Vowels {
    public static void main(String[] args) {
        // Java Program to Count Vowels and Consonants
        // pramod -> a,i,e,o,u -> V- 2, C- 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Number of Vowels: "+ vowels + " Number of Consonants: "+ consonants);

    }


}
