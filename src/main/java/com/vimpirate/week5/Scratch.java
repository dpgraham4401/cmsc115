package com.vimpirate.week5;

import java.util.Scanner;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        StringBuilder textEntries = new StringBuilder();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            try {
                int number = Integer.parseInt(line);
                sum += number;
            } catch (NumberFormatException e) {
                textEntries.append(line);
            }
        }

        System.out.println(sum + "," + textEntries.toString());
    }

}
