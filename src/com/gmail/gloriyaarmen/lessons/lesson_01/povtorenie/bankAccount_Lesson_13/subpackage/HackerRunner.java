package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.subpackage;

import com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.Hacker;

public class HackerRunner {
    public static void main(String[] args) {
        Hacker hacker = new Hacker(null);
//        hacker.hack(); // hack() has a package-private access (имеет пакет-частный доступ, из другого пакета доступа к нему нет)
//        hacker.info(); // hack() has a package-private access (имеет пакет-частный доступ, из другого пакета доступа к нему нет)
    }
}
