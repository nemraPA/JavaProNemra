package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(42000);
        account.info();
        boolean blocked = account.isBlocked();
        System.out.println("Account is blocked - " + blocked);

        account.addMoney(-1000000);
        account.info();

        System.out.println("-= Hack account =- ");
        Hacker hacker = new Hacker(account);
        hacker.info();
        hacker.hack();
        account.info();
    }
}
