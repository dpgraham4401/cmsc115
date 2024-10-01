package com.vimpirate.week7;

/**
 * Scratch code for week 7 quizzes and questions
 */
public class Scratch {

    // Assignment: In this quiz, you will develop a Weather Station application. The first step is to write a Java method recordTemperatures that takes an array of doubles as a parameter, which will store daily temperatures. The method should ask the user to input temperatures for each item in the array. The method does not return anything.
    public static void main(String[] args) {

        double[] temperatures = new double[7];

        // Record temperatures for seven days
        recordTemperatures(temperatures);

        // Calculate and print the average temperature
        double average = calculateAverage(temperatures);
        System.out.printf("Average temperature: %.2f%n", average);

        // Find and print the lowest and highest temperatures
        double[] extremes = findExtremes(temperatures);
        System.out.printf("Lowest temperature: %.2f%n", extremes[0]);
        System.out.printf("Highest temperature: %.2f%n", extremes[1]);

        // Check and print if the temperature is uniform within 5 and 10 degrees
        boolean uniformWithin5 = isUniform(temperatures, 5.0);
        boolean uniformWithin10 = isUniform(temperatures, 10.0);
        System.out.printf("Uniform within 5 degrees: %b%n", uniformWithin5);
        System.out.printf("Uniform within 10 degrees: %b%n", uniformWithin10);
    }


    public static boolean isUniform(double[] temperatures, double range) {
        if (temperatures == null || temperatures.length == 0) {
            throw new IllegalArgumentException("Temperature array must not be null or empty");
        }

        double[] extremes = findExtremes(temperatures);
        double min = extremes[0];
        double max = extremes[1];

        return (max - min) <= range;
    }


    public static double[] findExtremes(double[] temperatures) {
        if (temperatures == null || temperatures.length == 0) {
            throw new IllegalArgumentException("Temperature array must not be null or empty");
        }

        double min = temperatures[0];
        double max = temperatures[0];

        for (double temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }

        return new double[]{min, max};
    }

    public static double calculateAverage(double[] temperatures) {
        double sum = 0;
        for (double e : temperatures) {
            sum += e;
        }
        return sum / temperatures.length;
    }

    public static void recordTemperatures(double[] temperatures) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
    }

}
