package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13;

public class BankAccount {
    private int amount;
    private int cardNumber;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



    public int getAmount() {
        return amount;
    }

    public void addMoney(int value) {
        if(amount + value < 0) {
            System.out.println("You don't have enough maney.");
            return;
        }
        this.amount += value;
    }

    public void info() {
        System.out.println("I have: " + amount);
    }
}
