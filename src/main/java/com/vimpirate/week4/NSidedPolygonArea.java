package com.vimpirate.week4;

import java.util.Scanner;

/**
 * A regular polygon is an n-sided polygon in which all sides are of the same length and all
 * angles have the same degree. The formula for computing the area is = (s^2 * n)/(4 * tan(pi/n));
 * where s is the length of a side.
 * <p>
 * Write a program that prompts the user to enter the number of sides and their
 * length of a regular polygon and displays its area.
 * <p>
 * Sample Run
 * <p>
 * Enter the number of sided: 5
 * Enter the length of a side: 6.5
 * The area of the polygon is 72.6903
 */
public class NSidedPolygonArea {

    public static void main(String[] args) {
        // create scanner object
        java.util.Scanner input = new Scanner(System.in);

        // prompt user for number of sides
        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        // prompt user for length of a side
        System.out.print("Enter the length of a side: ");
        double s = input.nextDouble();

        // calculate the area of the polygon
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        System.out.printf("The area of the polygon is %.4f", area);
    }
}
