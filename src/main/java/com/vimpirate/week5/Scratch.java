package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        int count = 0;
        do {
            if (count % 11 == 0) {
                System.out.println("Good-bye, World!");
            } else {
                System.out.println("Hello, World!");
            }
            count++;
        } while (count < 50);

    }

}
