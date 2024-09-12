package com.vimpirate.week5;

import java.util.Scanner;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = 0;
        int previousReading = stdin.nextInt();

        while (true) {
            int currentReading = stdin.nextInt();
            if (currentReading < 0) {
                break;
            }
            if (Math.abs(currentReading - previousReading) > 5) {
                count++;
            }
            previousReading = currentReading;
        }

        System.out.println(count);
    }
}
