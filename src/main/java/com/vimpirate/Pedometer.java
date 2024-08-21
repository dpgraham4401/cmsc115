package com.vimpirate;

public class Pedometer {
    public static void main(String[] args) {
        int steps = 115000;
        int days = 10;
        double stepsPerDay = (double) steps /days;
        System.out.println("Average number of steps per day: " + stepsPerDay);
    }
}
