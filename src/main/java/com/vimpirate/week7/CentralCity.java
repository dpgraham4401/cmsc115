package com.vimpirate.week7;

import java.util.Scanner;

/**
 * Given a set of cities, the central point is the city that has the shortest total distance to all other cities.
 * Write a program that prompts the user to enter the number of the cities and the locations of the
 * cities (that is, their coordinates), and finds the central city and the total distances to the central city.
 */
public class CentralCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of cities
        System.out.print("Enter the number of cities: ");
        int numberOfCities = scanner.nextInt();

        // Create an array to store the coordinates of the cities
        double[][] cities = new double[numberOfCities][2];

        // Prompt the user to enter the coordinates of the cities
        System.out.print("Enter the coordinates of the cities: ");
        for (int i = 0; i < numberOfCities; i++) {
            cities[i][0] = scanner.nextDouble();
            cities[i][1] = scanner.nextDouble();
        }

        // Find the central city
        int centralCityIndex = findCentralCity(cities);

        // Calculate the total distance to the central city
        double totalDistance = calculateTotalDistance(cities, centralCityIndex);

        // Display the central city and the total distance
        System.out.printf("The central city is at (%.1f, %.1f)%n", cities[centralCityIndex][0], cities[centralCityIndex][1]);
        System.out.printf("The total distance to all other cities is %.15f%n", totalDistance);
    }

    // Method to find the central city
    public static int findCentralCity(double[][] cities) {
        int centralCityIndex = 0;
        double shortestTotalDistance = Double.MAX_VALUE;

        for (int i = 0; i < cities.length; i++) {
            double totalDistance = calculateTotalDistance(cities, i);
            if (totalDistance < shortestTotalDistance) {
                shortestTotalDistance = totalDistance;
                centralCityIndex = i;
            }
        }

        return centralCityIndex;
    }

    // Method to calculate the total distance from a city to all other cities
    public static double calculateTotalDistance(double[][] cities, int cityIndex) {
        double totalDistance = 0;

        for (int i = 0; i < cities.length; i++) {
            if (i != cityIndex) {
                totalDistance += distance(cities[cityIndex], cities[i]);
            }
        }

        return totalDistance;
    }

    // Method to calculate the distance between two cities
    public static double distance(double[] city1, double[] city2) {
        return Math.sqrt(Math.pow(city1[0] - city2[0], 2) + Math.pow(city1[1] - city2[1], 2));
    }

}
