package com.vimpirate.week7;

/**
 * Explain the difference (using code comments) between a single dimension and a multidimensional array in Java
 * by providing an example of each in a simple program.
 *
 * @Author: David Graham
 * CMSC 115 - Week 7 Discussion
 */
public class Discussion {

    public static void main(String[] args) {
        // Single-dimensional array
        int[] singleDimArray = {1, 2, 3, 4, 5};

        // A single dimension array stores a (single) series of elements
        // each element is accessed through a bracket notation with an integer
        // (or expression that results in an integer) surrounded by a pair of brackets.
        System.out.println("Single-dimensional array:");
        for (int i = 0; i < singleDimArray.length; i++) {
            System.out.print(singleDimArray[i] + " ");
        }
        System.out.println();

        // Multidimensional array (2D array)
        // are declared with a notation that uses two brackets [].
        int[][] multiDimArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // multidimensional arrays are accessed also using a two-bracket notation.
        // accessing using a single bracket will only show the first dimension and will
        // result in an ArrayIndexOutOfBoundsException if you try to use a syntax like [i + j]
        // in this example.
        System.out.println("Multidimensional array:");
        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                System.out.print(multiDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
