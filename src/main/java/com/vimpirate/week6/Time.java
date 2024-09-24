package com.vimpirate.week6;

/**
 * Write a function that converts milliseconds to hours, minutes, and seconds using the following header:
 * public static String convertMillis(long millis)
 * The function returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns the string 0:0:5,
 * convertMillis(100000) returns the string 0:1:40, and convertMillis(555550000) returns the string 154:19:10.
 * Write a test program that prompts the user to enter a value for milliseconds and displays a string in the format of hours:minutes:seconds.
 * <p>
 * Sample Run
 * Enter time in milliseconds: 555550000
 * 154:19:10
 *
 * @Author: David Graham
 * CMSC 115 - Chapter 6 Project 4
 */
public class Time {

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long totalMinutes = totalSeconds / 60;
        long hours = totalMinutes / 60;
        long seconds = totalSeconds % 60;
        long minutes = totalMinutes % 60;
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter time in milliseconds: ");
        long millis = scanner.nextLong();
        System.out.println(convertMillis(millis));
    }
}
