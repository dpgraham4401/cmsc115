package com.vimpirate.week5;

import java.util.Scanner;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // Read the starting number from the user
        System.out.print("Enter the starting number: ");
        int un = stdin.nextInt();
        int counter = 0;

        // Print the initial value
        System.out.println("u" + counter + " = " + un);

        // Apply the Collatz sequence
        do {
            if (un % 2 == 0) {
                un /= 2;
            } else {
                un = un * 3 + 1;
            }
            counter++;
            System.out.println("u" + counter + " = " + un);
        } while (un != 1);
    }

}
