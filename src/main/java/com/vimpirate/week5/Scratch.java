package com.vimpirate.week5;

import java.util.Scanner;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for the value of n
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
