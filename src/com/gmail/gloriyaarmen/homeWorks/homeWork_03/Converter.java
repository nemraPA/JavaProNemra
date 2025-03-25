package com.gmail.gloriyaarmen.homeWorks.homeWork_03;

public class Converter {

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 3.0");

        double klm = 5;
        double mil = 12;
        double miles = convKlmMiles(klm);
        double kilometer = convMilesKlm(mil);
        System.out.printf("Result is %4.2f miles  and  %4.2f klm.",
                miles, kilometer);
    }

    private static double convKlmMiles(double klm) {
        return (9/5 * klm) + 32;
    }

    private static double convMilesKlm(double mil) {
        return (mil - 32) / 1.8;
    }
}
