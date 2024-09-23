package com.vimpirate.week6;

/**
 * Explain the difference (using code comments) between using pass-by-value and pass-by-reference
 * when implementing methods in Java by providing an example of each in a simple program.
 *
 * @Author: David Graham
 * CMSC 115 - Week 3 Discussion
 */
public class Discussion {

    public static void main(String[] args) {
        Discussion discussion = new Discussion();
        // Pass-by-value example
        int a = 5;
        System.out.println("Value of a before passByValue: " + a); // a is 5
        discussion.passByValue(a);
        System.out.println("Value of a after passByValue: " + a); // a remains 5

        // Pass-by-reference example
        int[] arr = {1, 2, 3};
        System.out.println("Value of arr[0] before passByReference: " + arr[0]); // arr[0] is changed to 10
        discussion.passByReference(arr);
        System.out.println("Value of arr[0] after passByReference: " + arr[0]); // arr[0] is changed to 10

    }

    /**
     * Pass-by-value example
     * in this instance, the value is copied and the original value is not changed
     */
    public void passByValue(int x) {
        x = 10;
    }

    /**
     * Pass-by-reference example
     * In this example, the array is passed by reference and the original value is changed without returning
     * the value
     */
    public void passByReference(int[] x) {
        x[0] = 10;
    }
}
