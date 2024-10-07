package com.vimpirate.week8;


import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location location = locateLargest(array);
        System.out.println("The largest element is " + location.maxValue + ", located at (" + location.row + "," + location.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        location.row = 0;
        location.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }

        return location;
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;
}