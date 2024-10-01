package com.vimpirate.week7;

import java.util.Scanner;

/**
 * Write a program that reads a list of scores and then assigns grades based on the following scheme:
 * The grade is A if score is >= best – 10.
 * The grade is B if score is >= best – 20.
 * The grade is C if score is >= best – 30.
 * The grade is D if score is >= best – 40.
 * The grade is F otherwise.
 * <p>
 * The program prompts the user to enter the total number of students, then prompts the user to
 * enter all of the scores, and concludes by displaying the grades.
 */
public class AssignGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store the scores
        int[] scores = new int[numberOfStudents];

        // Prompt the user to enter the scores
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        // Find the best score
        int best = findBestScore(scores);

        // Assign and display grades
        for (int i = 0; i < numberOfStudents; i++) {
            char grade = assignGrade(scores[i], best);
            System.out.printf("Student %d score is %d and grade is %c%n", i, scores[i], grade);
        }
    }

    // Method to find the best score
    public static int findBestScore(int[] scores) {
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }
        return best;
    }

    // Method to assign grade based on the score and best score
    public static char assignGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
