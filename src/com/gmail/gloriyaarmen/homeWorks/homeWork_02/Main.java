package com.gmail.gloriyaarmen.homeWorks.homeWork_02;

public class Main {
    private static final double CONV_M = 0.6214;

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 2.0");

        double klm = 5;
        double mil = 12;
        double miles = convKlmMiles(klm);
        double kilometer = convMilesKlm(mil);
        System.out.printf("Result is %4.2f miles  and  %4.2f klm.", miles, kilometer);

    }

    private static double convKlmMiles(double klm) {
        return klm * CONV_M;
    }

    private static double convMilesKlm(double mil) {
        return mil / CONV_M;
    }
}
