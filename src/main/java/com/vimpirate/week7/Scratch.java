package com.vimpirate.week7;

/**
 * Scratch code for week 7 quizzes and questions
 */
public class Scratch {

    // Assignment: In this quiz, you will develop a Weather Station application. The first step is to write a Java method recordTemperatures that takes an array of doubles as a parameter, which will store daily temperatures. The method should ask the user to input temperatures for each item in the array. The method does not return anything.
    public static void main(String[] args) {
        double[] temperatures = new double[7];
        recordTemperatures(temperatures);
    }

    public static void recordTemperatures(double[] temperatures) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
    }
}
