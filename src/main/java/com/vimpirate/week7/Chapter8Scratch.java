package com.vimpirate.week7;

public class Chapter8Scratch {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int totalSum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                if (x == y) {
                    totalSum += arr[x][y];
                }
            }
        }
        System.out.println(totalSum);
    }
}
