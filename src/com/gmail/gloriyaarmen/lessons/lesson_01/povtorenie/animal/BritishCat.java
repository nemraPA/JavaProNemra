package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.animal;

public class BritishCat extends Cat {
    @Override
    public void describe() {
//        System.out.println("I'm a british cat");
        super.describe();
    }

    @Override
    public void say() {
        System.out.println("Meow-meow in english");
    }
}
