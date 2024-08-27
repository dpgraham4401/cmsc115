package com.vimpirate.week2;

import java.util.Scanner;

public class Exercise {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investment = scanner.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter number of years:  ");
        double years = scanner.nextDouble();

        double futureInvestmentValue = investment * Math.pow(1 + interestRate / 1200, years * 12);
        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }
}
