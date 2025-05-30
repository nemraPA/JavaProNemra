package com.gmail.gloriyaarmen.lessons.lesson_01.animal;

public class Cat extends Animal {
    String color;

    public Cat() {
        super("default cat", -1);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void describe() {
        System.out.println("I'm a " + color + " cat. My name is " + name + ". My age is " + age);
    }
}
