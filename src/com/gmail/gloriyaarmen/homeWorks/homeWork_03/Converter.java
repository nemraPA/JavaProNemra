package com.gmail.gloriyaarmen.homeWorks.homeWork_03;

public class Converter {

    public static void main(String[] args) {
        System.out.println("App for measures converting.");
        System.out.println("Version 3.0");

        double inFhrn = 17;
        double celsius = convFhrnCels(inFhrn);
        System.out.printf("Result is %4.2f сelsius.", celsius);
    }

    private static double convFhrnCels(double inFhrn) {
        return (inFhrn - 32) * 5/9;
    }
}
