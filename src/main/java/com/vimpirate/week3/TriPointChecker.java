package com.vimpirate.week3;

import java.util.Scanner;

/**
 * a program that prompts the user to enter a point and checks whether the point is
 * within the rectangle centered at with width 10 and height 5.
 */
public class TriPointChecker {
    private final static double WIDTH = 10;
    private final static double HEIGHT = 5;

    /**
     * entry point for our application. It prompts for user endpoint, processes, and displays the result.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (pointIsWithinWidth(x) && pointIsWithinHeight(y)) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }

    /**
     * checks if the point is within the width of the rectangle
     */
    private static boolean pointIsWithinWidth(double x) {
        return x >= -WIDTH / 2 && x <= WIDTH / 2;
    }

    /**
     * checks if the point is within the height of the rectangle
     */
    private static boolean pointIsWithinHeight(double y) {
        return y >= -HEIGHT / 2 && y <= HEIGHT / 2;
    }
}
