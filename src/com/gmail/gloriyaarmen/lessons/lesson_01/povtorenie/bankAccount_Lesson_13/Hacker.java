package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13;

public class Hacker {
    private BankAccount account;

    public Hacker(BankAccount account) {
        this.account = account;
    }

    public void hack() {
        account.addMoney(-100000);
    }
}
