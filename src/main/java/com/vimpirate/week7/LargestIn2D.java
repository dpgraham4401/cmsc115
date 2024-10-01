package com.vimpirate.week7;

import java.util.Scanner;

/**
 * Write the following method that returns the location of the largest element in a two-dimensional array.
 * <p>
 * public static int[] locateLargest(double[][] a)
 * The return value is a one-dimensional array that contains two elements. These two elements indicate
 * the row and column indices of the largest element in the two-dimensional array. If there is more
 * than one largest element, return the smallest row index and then the smallest column index.
 * <p>
 * Write a test program that prompts the user to enter a two-dimensional array and displays
 * the location of the largest element in the array.
 */
public class LargestIn2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns of the array
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        // Create a two-dimensional array
        double[][] array = new double[rows][columns];

        // Prompt the user to enter the array
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        // Locate the largest element
        int[] location = locateLargest(array);

        // Display the location of the largest element
        System.out.printf("The location of the largest element is at (%d, %d)%n", location[0], location[1]);
    }

    // Method to locate the largest element in a two-dimensional array
    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
