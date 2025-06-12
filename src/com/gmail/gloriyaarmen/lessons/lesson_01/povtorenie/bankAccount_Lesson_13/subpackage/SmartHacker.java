package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.subpackage;

import com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.BankAccount;
import com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.Hacker;

public class SmartHacker extends Hacker {

    public SmartHacker() {
        super(null);
    }

    public SmartHacker(BankAccount account) {
        super(account);
    }

    public void smartInfo() {
        info();
    }
}
