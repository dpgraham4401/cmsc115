package com.vimpirate.week3;

import java.util.Scanner;

/**
 * prompts the user to enter the month and year and displays the number of days in the month.
 *
 * @Author: David Graham
 * CMSC 115 - Week 3 project 3
 */
public class NumberOfDays {

    /**
     * entry point for our application, renders the user prompt and displays results
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the month (e.g., 1 for Jan): ");
        int month = scanner.nextInt();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        int days = getNumberOfDays(month, year);
        String monthName = getMonthName(month);

        System.out.printf("%s %d has %d days", monthName, year, days);


    }

    private static int getNumberOfDays(int monthNumber, int year) {
        return switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // January, March, May, July, August, October, December
            case 4, 6, 9, 11 -> 30; // April, June, September, November
            // February

            case 2 -> {
                // A year is a leap year if it is divisible by 4, but not by 100 unless it is also divisible by 400.
                // if a year is divisible by 400, it is a leap year (it's definitely divisible by 4 and 100)
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> {
                System.out.println("Invalid month entered.");
                yield 0;
            }
        };
    }

    private static String getMonthName(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
    }
}
