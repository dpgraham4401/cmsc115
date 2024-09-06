package com.vimpirate.week4;

public class Answer {
    public static void main(String[] args) {
        String previousTitle = "hello";
        String title = "foo";
        if (title.compareToIgnoreCase(previousTitle) < 0) {
            System.out.println("\"" + title + "\" comes before \"" + previousTitle + "\"");
        } else if (title.compareToIgnoreCase(previousTitle) > 0) {
            System.out.println("\"" + title + "\" comes after \"" + previousTitle + "\"");
        } else {
            System.out.println("\"" + title + "\" is equal to \"" + previousTitle + "\"");
        }

    }
}