package ex_12_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab00_While_Guess_Number {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number");
        int guess;
        int attempts = 0;

        while (true) {
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {

                System.out.println("enter bigger number");
            } else if (guess > numberToGuess) {
                System.out.println("enter smaller number");
            } else {
                System.out.println("Number matches in " + attempts + " attempts");
                break;
            }

        }
    }
}
