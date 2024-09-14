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
        int input = 0;
        int greatest = 0;
        while (input >= 0) {
            input = stdin.nextInt();
            if (input > greatest)
                greatest = input;
        }
        System.out.println(greatest);
    }
}
