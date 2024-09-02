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
     * @param studentName the student's name
     * @return int the student's grade
     * @NestedIfStatement The nested if statement is used to evaluate conditions that are dependent on
     * each other (not the perfect example here). We only want to check if the student's name
     * is David Graham if we know that the name is not empty.
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
     * @Switch A switch statement (or expression in this example) is great for when we have (several) discrete values
     * that the variable will match. It's not the optimal choice when we need to evaluate (for example)
     * if the grade was between two values.
     * Note: here we are using a switch expression which as proposed in JEP 325. I've implemented the same
     * as a "switch statement" in another method for the sake of completeness
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
     * @param score the integer score of the test
     * @return String the letter grade
     * @MultiWayIfStatement This function uses a multi-way if statement to evaluate the score
     * a student received on a test.
     * The if statement allows us to evaluation an expression
     * (for example evaluate whether the values is between 90 and 100).
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

    /**
     * Get the teacher's evaluation based on the student's letter grade
     * <p>
     * This method is here just to show the switch statement version of our getTeacherEvaluation method.
     * It is functionally equivalent, note the inclusion of the break statement in each case.
     */
    private String getTeachEvaluationWithSwitchStatement(String letterGrade) {
        String evaluation = "";
        switch (letterGrade) {
            case "A+":
                evaluation = "Wow! You're a genius, and really good at kung fu!";
                break;
            case "A":
                evaluation = "Awesome! keep up the good work!";
                break;
            case "B":
                evaluation = "2nd place? that's a fancy word for loosing";
                break;
            case "C":
                evaluation = "well, at least you didn't fail";
                break;
            case "D":
                evaluation = "Don't quit your day job";
                break;
            case "F":
                evaluation = "... you tried";
                break;
            default:
                evaluation = "you miss 100% of the shots you don't take, next time take the test";
                break;
        }
        return evaluation;
    }
}