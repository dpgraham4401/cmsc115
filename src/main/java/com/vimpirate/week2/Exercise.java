package com.vimpirate.week2;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");

        double subTotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble() / 100;
        double gratuity = subTotal * gratuityRate;

        System.out.println("The gratuity is " + gratuity + " and total is " + (subTotal + gratuity));
    }
}
