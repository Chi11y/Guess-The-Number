package com.company;

import java.util.Scanner;

public class GuessTest {

    public static void Guess(){
        Scanner scanner = new Scanner(System.in);
        int guess;
        int number = (int) (Math.random() * 100) + 1;
        int guessLimit = 5;
        System.out.println("Please guess a number between 1 and 100");
        System.out.println("You only have 5 attempts");

        int currentGuess = 1;
        do {

            guess = scanner.nextInt();
            if (number == guess) System.out.println("Well done, the number was " + number);
            else if (currentGuess < guessLimit) System.out.println("Please try again");
            currentGuess++;
        } while ((guess != number) && (currentGuess <= guessLimit));
        if (currentGuess > guessLimit) {
            System.out.println("Too many guesses, you lose! " + "The correct number was: " + number);
        }
    }
}
