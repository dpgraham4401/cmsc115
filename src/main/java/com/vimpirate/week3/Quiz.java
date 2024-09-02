package com.vimpirate.week3;

public class Quiz {

    public static void main(String[] args) {
        int age = 25; // Example age
        String category = (age >= 0 && age <= 12) ? "Child" :
                (age >= 13 && age <= 19) ? "Teen" :
                        (age >= 20 && age <= 64) ? "Adult" :
                                "Senior";
        System.out.println(category);

    }
}
