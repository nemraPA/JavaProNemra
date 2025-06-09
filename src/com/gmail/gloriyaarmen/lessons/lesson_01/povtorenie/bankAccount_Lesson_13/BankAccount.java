package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13;

public class BankAccount {
    int amount;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public void info() {
        System.out.println("I have: " + amount);
    }
}
