package com.vimpirate.week2;

import java.util.Scanner;

public class InputScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        double d = input.nextDouble();

        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
    }
}
