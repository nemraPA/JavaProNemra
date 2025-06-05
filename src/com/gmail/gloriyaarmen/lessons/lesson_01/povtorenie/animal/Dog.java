package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.animal;

public class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void say() {
        System.out.println("gav-gav");
    }

    public void jamp() {
        System.out.println("jamping...");
    }
}
