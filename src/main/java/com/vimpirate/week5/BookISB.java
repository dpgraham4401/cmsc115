package com.vimpirate.week5;

import java.util.Scanner;

public class BookISB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN number as a string: ");
        String input = scanner.nextLine();

        if (input.length() != 12 || !input.matches("\\d{12}")) {
            System.out.println(input + " is an invalid input");
            return;
        }

        int checksum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            if (i % 2 == 0) {
                checksum += digit;
            } else {
                checksum += 3 * digit;
            }
        }

        checksum = 10 - (checksum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        String isbn13 = input + checksum;
        System.out.println("The ISBN-13 number is " + isbn13);
    }
}