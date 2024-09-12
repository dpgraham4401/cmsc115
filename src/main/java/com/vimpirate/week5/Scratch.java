package com.vimpirate.week5;

/**
 * class I use for testing code snippets
 *
 * @Author: David Graham
 */
public class Scratch {

    public static void main(String[] args) {
        java.util.Scanner stdin = new java.util.Scanner(System.in);
        String username = "";
        int minLength = 8;
        while (username.length() < minLength) {
            username = stdin.next();
        }
        System.out.println(username);
    }
}
