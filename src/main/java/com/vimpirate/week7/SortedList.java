package com.vimpirate.week7;

import java.util.Scanner;

public class SortedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the list
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();

        // Create an array to store the list
        int[] list = new int[size];

        // Prompt the user to enter the content of the list
        System.out.print("Enter the content of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        // Display the list
        System.out.print("The list has " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        // Check if the list is sorted
        if (isSorted(list)) {
            System.out.println("is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }

    // Method to check if the list is sorted in nondecreasing order
    public static boolean isSorted(int[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
