package com.vimpirate.week5;

/**
 * Explain the difference (using code comments) between pretest and posttest loops by providing an example of
 * a simple program that uses one pretest and one posttest loop. Make sure your example is unique
 * (different than that provided by your classmates and not found in the textbook).
 *
 * @Author: David Graham
 * CMSC 115 - Week 5 Discussion
 */
public class ComplimentStudent {

    public static void main(String[] args) {
        String[] compliments = {"You're awesome!", "Keep up the good work!", "Keep practicing, you're getting better!"};
        int numberOfDaysPracticed = 2;
        int numberOfComplimentsGiven = 0;
        int numberOfAwardsGiven = 0;

        /*
            Posttest loop
          Here, we ensure that the student is complimented for each day they practice, but
          even if they haven't practiced at all, they will still receive a compliment.
          Because that's the society we live in, evidently.
         */
        do {
            System.out.println(compliments[numberOfComplimentsGiven]);
            numberOfComplimentsGiven++;
        } while (numberOfComplimentsGiven < numberOfDaysPracticed);

        /*
          Pretest loop
          we only run the loop, and give an award, if the student has practiced at least once.
         */
        while (numberOfAwardsGiven < numberOfDaysPracticed) {
            System.out.println("You've earned an award!");
            numberOfAwardsGiven++;
        }
    }
}
