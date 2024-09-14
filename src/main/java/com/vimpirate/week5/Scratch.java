package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        int sum = 0;
        int item = 0;
        do {
            item++;
            if (sum >= 4)
                continue;
            sum += item;
        }
        while (item < 5);
        System.out.println("sum = " + sum);
    }

}
