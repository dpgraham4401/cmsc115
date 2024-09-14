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

        // Take two integer inputs from the user
        System.out.print("Enter the first number: ");
        int num1 = stdin.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = stdin.nextInt();

        int gcd = 1; // Initialize GCD to 1

        // Use a for loop to find the GCD
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update GCD
            }
        }

        // Print the result
        System.out.println("The Greatest Common Denominator is: " + gcd);

    }

}
