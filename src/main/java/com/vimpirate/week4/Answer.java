package com.vimpirate.week4;

public class Answer {
    public static void main(String[] args) {
        String siteAddress = "www.example.com";
        String resourcePath = "contact";
        boolean isSecure = false;

        String url = (isSecure ? "https://" : "http://") + siteAddress + (resourcePath.startsWith("/") ? resourcePath : "/" + resourcePath);
        System.out.println(url);
    }
}