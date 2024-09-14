package com.vimpirate.week5;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int total = 0;
        int count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            total += number;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            double average = (double) total / count;
            System.out.println("The number of positives is " + countPositive);
            System.out.println("The number of negatives is " + countNegative);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        }
    }
}
