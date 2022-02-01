package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scanner = new Scanner(System.in);
    int guess;
    int number = (int) (Math.random() * 100) + 1;
    System.out.println("Please guess a number between 1 and 10");

    do {
      guess = scanner.nextInt();
      if (number == guess)
        System.out.println("Well done, the number was " + number);
       else if (number != guess) System.out.println("Please try again");
    } while (guess != number);

  }
}
