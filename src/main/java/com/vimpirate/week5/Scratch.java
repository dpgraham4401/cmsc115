package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        java.util.Scanner stdin = new java.util.Scanner(System.in);
        int userInput = 1;
        while (userInput % 3 != 0) {
            System.out.println("Enter a number divisible by 3: ");
            userInput = stdin.nextInt();
        }
    }
}
