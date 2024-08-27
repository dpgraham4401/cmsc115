package com.vimpirate.week2;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Insert the second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("The product is " + firstNumber * secondNumber);
    }
}
