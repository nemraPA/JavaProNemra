package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(42000);
        account.info();

        account.addMoney(-1000000);
        account.info();
    }
}
