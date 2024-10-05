package com.vimpirate.week8;

/**
 * class that will serve as our application entry point
 * while we learn about OOP with java.
 */
public class Main {
    public static void main(String[] args) {
        Org org = new Org(1, "foo");
        org.setDescription("hello");
        System.out.println(org);
    }
}
