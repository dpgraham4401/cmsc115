package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        int totalPoints = 0;

        for (int level = 1; level <= 20; level++) {
            int pointsForLevel = level * level * level; // level^2 * level
            totalPoints += pointsForLevel;
        }

        System.out.println("Total points earned from the first 20 levels: " + totalPoints);

    }

}
