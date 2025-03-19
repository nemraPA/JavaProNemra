package com.gmail.gloriyaarmen.homeWorks.homeWork_01.app;

public class Main {
    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter App");

        double kgs = 5;
        double pnds = 12;
        double pounds = convKgsPounds(kgs);
        double kilos = convPoundsToKgs(pnds);
        System.out.println("Result is " + pounds + "pounds and "
        + kilos + " kgs.");

    }

    private static double convKgsPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }
}
