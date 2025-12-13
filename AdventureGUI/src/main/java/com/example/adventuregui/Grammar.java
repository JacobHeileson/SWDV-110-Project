package com.example.adventuregui;

public class Grammar {

    public static void wants(String proSubj) {
        if (proSubj.equals("he") || proSubj.equals("she")) {
            System.out.print(" wants");
        } else {
            System.out.print(" want");
        }
    }

    public static void needs(String proSubj) {
        if (proSubj.equals("he") || proSubj.equals("she")) {
            System.out.print(" needs");
        } else {
            System.out.print(" need");
        }
    }

    public static void has(String proSubj) {
        if (proSubj.equals("he") || proSubj.equals("she")) {
            System.out.print(" has");
        } else {
            System.out.print(" have");
        }
    }

    public static String capitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

}
