package com.vimpirate.week6;

/**
 * Explain the difference (using code comments) between using pass-by-value and pass-by-reference
 * when implementing methods in Java by providing an example of each in a simple program.
 */
public class Discussion {

    public static void main(String[] args) {
        

    }

    // Pass-by-value example
    public void passByValue(int x) {
        x = 10;
    }

    // Pass-by-reference example
    public void passByReference(int[] x) {
        x[0] = 10;
    }
}
