package com.gmail.gloriyaarmen.homeWorks.homeWork_03;

public class Converter {

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 3.0");

        double inFhrn = 17;
        double inCels = 7;
        double celsius = convFhrnCels(inFhrn);
        double fahrenheit = convCelsFhrn(inCels);
        System.out.printf("Result is %4.2f сelsius  and   %4.2f fahrenheit.", celsius, fahrenheit);
    }

    private static double convFhrnCels(double inFhrn) {
        return (inFhrn - 32) * 5/9;
    }

    private static double convCelsFhrn(double inCels) {
        return inCels * 9/5 + 32;
    }

}
