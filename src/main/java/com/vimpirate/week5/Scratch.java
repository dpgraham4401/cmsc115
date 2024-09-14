package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < i; j++) {
                count++;
                System.out.println(count);
            }

    }

}
