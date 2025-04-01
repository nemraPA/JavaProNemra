package com.gmail.gloriyaarmen.homeWorks.homeWork_08;

import java.util.Scanner;

public class Main {
    static double balance;

    public static void main(String[] args) {
        balance = validateAmount(getBalance(), getAmount());
    }

    private static double getBalance() {
        return 1000.00; // Наявні кошти на рахунку
    }

    private static double getAmount() {
        System.out.printf("Balance is USD %.2f.%n" +
                "Enter purchase amount, USD: ", getBalance());
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Метод валідації наявних коштів
    private static double validateAmount(double balance, double withdrawal) {
        if (withdrawal > getBalance()) {
            try {
                throw new FindsException("Insufficient funds!");
            } catch (FindsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid." +
                    "%nBalance is USD %.2f", balance);
        }
        return balance;
    }


    // Метод розрахунку наявних коштів на рахунку
    // після зняття певної суми коштів
    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}