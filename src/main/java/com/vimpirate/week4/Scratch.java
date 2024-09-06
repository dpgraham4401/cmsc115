package com.vimpirate.week4;

public class Scratch {
    public static void main(String[] args) {
        double x = 10.0;
        double result;
        if (x > 0) {
            result = x * Math.log(x) - ((double) 3 / 2) * x;
        } else if (x < 0) {
            result = 2 - (3 / x) + (3 / Math.pow(x, 2));
        } else {
            result = Double.POSITIVE_INFINITY;
        }
        System.out.println(result);
    }
}
