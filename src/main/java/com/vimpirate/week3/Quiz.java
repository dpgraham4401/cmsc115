package com.vimpirate.week3;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        String result = "";
        if (grade >= 90) {
            result = "Your grade is: A";
        } else if (grade >= 80) {
            result = "Your grade is: B";
        } else if (grade >= 70) {
            result = "Your grade is: C";
        } else if (grade >= 60) {
            result = "Your grade is: D";
        } else {
            result = "Your grade is: F";
        }
        System.out.println(result);
    }
}
