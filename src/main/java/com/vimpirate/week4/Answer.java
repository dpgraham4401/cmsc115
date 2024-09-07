package com.vimpirate.week4;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read model name
        String modelName = scanner.nextLine().trim();
        // Read production year
        int year = Integer.parseInt(scanner.nextLine().trim());

        // Check for exact match
        boolean exactMatch = modelName.equals("PowerPack") || modelName.equals("EnergyBar");
        System.out.println(exactMatch ? "Exact match found." : "Exact match not found.");

        // Check for case-insensitive match
        boolean caseInsensitiveMatch = modelName.equalsIgnoreCase("PowerPack") || modelName.equalsIgnoreCase("EnergyBar");
        System.out.println(caseInsensitiveMatch ? "Case-insensitive match found." : "Case-insensitive match not found.");

        // Check for substring match ignoring case
        boolean substringMatch = modelName.toLowerCase().contains("powerpack".toLowerCase()) || modelName.toLowerCase().contains("energybar".toLowerCase());
        System.out.println(substringMatch ? "Substring match found." : "Substring match not found.");

        if (substringMatch) {
            if ((modelName.toLowerCase().contains("powerpack") && year >= 2015 && year <= 2018) ||
                    (modelName.toLowerCase().contains("energybar") && year >= 2016 && year <= 2019)) {
                System.out.println("Issue notice.");
            } else {
                System.out.println("OK.");
            }
        }
    }
}