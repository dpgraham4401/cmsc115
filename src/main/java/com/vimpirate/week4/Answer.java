package com.vimpirate.week4;

import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if (input >= 0 && input <= 127) {
            System.out.println("ASCII - '" + (char) input + "'");
        } else {
            System.out.println("Unicode - '" + (char) input + "'");
        }
    }
}