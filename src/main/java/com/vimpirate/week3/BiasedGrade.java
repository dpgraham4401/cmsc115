package com.vimpirate.week3;

/**
 * Using commented code, describe the difference between a nested if, multi-way if, and a switch statement
 * by providing a simple program that uses all three of these types of statements.
 *
 * @Author: David Graham
 * CMSC 115 - Week 3 Discussion
 */
public class BiasedGrade {

    public static void main(String[] args) {
        BiasedGrade grade = new BiasedGrade();
        String studentName = "David Graham";

        // get the student's grade, letter grade, and teacher's evaluation
        int studentGrade = grade.getStudentGrade(studentName);
        String letterGrade = grade.getLetterGrade(studentGrade);
        String teacherEvaluation = grade.getTeacherEvaluation(letterGrade);

        // display our results
        System.out.println("Student: " + studentName);
        System.out.println("Grade: " + studentGrade);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("Teacher's Evaluation: " + teacherEvaluation);
    }

    /**
     * Get the student's grade based on their name
     *
     * @NestedIfStatement
     * The nested if statement is used to evaluate conditions that are dependent on
     * each other (not the perfect example here). We only want to check if the student's name
     * is David Graham if we know that the name is not empty.
     * @param studentName the student's name
     * @return int the student's grade
     */
    public int getStudentGrade(String studentName) {
        int grade = 0;
        if (!studentName.isEmpty()) {
            grade += 91;
            if (studentName.equals("David Graham")) {
                grade = 100;
            }
        }
        return grade;
    }

    /**
     * Based on the letter grade, return the teacher's (harsh) evaluation
     *
     * @SwitchStatement
     * The switch statement is great for when we have (several) discrete values
     * that the variable will match. It doesn't git well when we need to evaluate (for example)
     * if the grade was between two values.
     * @param letterGrade the letter grade
     * @return String the teacher's opinion
     */
    public String getTeacherEvaluation(String letterGrade) {
        String evaluation = "";
        switch (letterGrade) {
            case "A+" -> evaluation = "Wow! You're a genius, and really good at kung fu!";
            case "A" -> evaluation = "Awesome! keep up the good work!";
            case "B" -> evaluation = "2nd place? that's a fancy word for loosing";
            case "C" -> evaluation = "well, at least you didn't fail";
            case "D" -> evaluation = "Don't quit your day job";
            case "F" -> evaluation = "... you tried";
            default -> evaluation = "you miss 100% of the shots you don't take, next time take the test";
        }
        return evaluation;
    }

    /**
     * Get the letter grade (String) based on the score (int)
     *
     * @MultiWayIfStatement
     * This function uses a multi-way if statement to evaluate the score
     * a student received on a test.
     * The if statement allows us to evaluation an expression
     * (for example evaluate whether the values is between 90 and 100).
     * @param score the integer score of the test
     * @return String the letter grade
     */
    public String getLetterGrade(int score) {
        String letterGrade = "";
        if (score == 100) {
            letterGrade = "A+";
        } else if (score >= 90) {
            letterGrade = "A";
        } else if (score >= 80) {
            letterGrade = "B";
        } else if (score >= 70) {
            letterGrade = "C";
        } else if (score >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }

}
