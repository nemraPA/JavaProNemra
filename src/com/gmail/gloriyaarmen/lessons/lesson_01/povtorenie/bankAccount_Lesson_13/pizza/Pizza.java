package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.pizza;

public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name;
    }

//    public void make() {

    /// /        System.out.println("Making " + name + "pizza");
//        System.out.println("Unknown receipt. Can't make " + name + " pizza");
//    }
    public abstract void make();
}
