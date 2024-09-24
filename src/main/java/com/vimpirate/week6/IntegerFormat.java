package com.vimpirate.week6;

/**
 * Write a method with the following header to format the integer with the specified width.
 * public static String format(int number, int width)
 * The method returns a string for the number with one or more prefix 0 s. The size of the string is the width.
 * For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. If the number is longer than the width,
 * the method returns the string representation for the number. For example, format(34, 1) returns 34.
 * Write a test program that prompts the user to enter a number and its width, and displays a string returned
 * by invoking format(number, width).
 * <p>
 * Sample Run
 * Enter an integer: 231
 * Enter the width: 8
 * The formatted number is 00000231
 *
 * @Author: David Graham
 * CMSC 115 - Chapter 6 Project 5
 */
public class IntegerFormat {

    /**
     * return the number as a formatted string with the specified width
     */
    public static String format(int number, int width) {
        String numberString = Integer.toString(number);
        if (numberString.length() >= width) {
            return numberString;
        }
        return "0".repeat(width - numberString.length()) + numberString;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        System.out.println("The formatted number is " + format(number, width));
    }
}
