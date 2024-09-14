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
        int input;
        int sum = 0;
        while (sum < 100) {
            input = stdin.nextInt();
            if (input > 0)
                sum += input;
        }
        System.out.println(sum);
    }
}
