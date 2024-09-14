package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        long totalElevation = 0;
        long step = 1;
        int count = 0;

        do {
            totalElevation += step;
            step *= 2;
            count++;
        } while (count < 50);

        System.out.println("Total elevation gain over 50 steps: " + totalElevation + " meters");
    }


}
