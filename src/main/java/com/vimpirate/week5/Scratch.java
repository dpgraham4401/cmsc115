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
            sum += item;
            if (sum > 4)
                break;
        }
        while (item < 5);
        System.out.println("item = " + item + " sum = " + sum);
    }

}
