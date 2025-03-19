package com.gmail.gloriyaarmen.homeWorks.homeWork_01.app;

public class Main {
    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter App");

        double kgs = 5;
        double pounds = convKgsPounds(kgs);
        System.out.println("Result is " + pounds + "pounds");

    }

}
