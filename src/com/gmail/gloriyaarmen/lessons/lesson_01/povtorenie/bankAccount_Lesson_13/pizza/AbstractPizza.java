package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.bankAccount_Lesson_13.pizza;

public abstract class AbstractPizza implements Pizza{
    private String name;

    public String getName() {
        return name;
    }

    public AbstractPizza(String name) {
        this.name = name;
    }

//    public void make() {

    /// /        System.out.println("Making " + name + "pizza");
//        System.out.println("Unknown receipt. Can't make " + name + " pizza");
//    }
    @Override
    public abstract void make();//можно и не указывать оверайд этого метода, он все равно будет виден в наследниках
}
