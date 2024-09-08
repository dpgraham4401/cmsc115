package com.vimpirate.week4;

/**
 * Write a program that prompts the user to enter a Social Security number in the format ddd-dd-dddd,
 * where d is a digit. Your program should check whether the input is valid.
 * <p>
 * Sample Run 1
 * <p>
 * Enter a string for SSN: 232-23-5435
 * 232-23-5435 is a valid social security number
 * Sample Run 2
 * <p>
 * Enter a SSN: 23-23-5435
 * 23-23-5435 is an invalid social security number
 */
public class SSNValidator {

    /**
     * Check if a string is a valid social security number
     */
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    }

    public static void main(String[] args) {
        // create scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // prompt user for SSN
        System.out.print("Enter a string for SSN: ");
        String ssn = input.nextLine();

        // check if SSN is valid
        if (isValidSSN(ssn)) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }
}
