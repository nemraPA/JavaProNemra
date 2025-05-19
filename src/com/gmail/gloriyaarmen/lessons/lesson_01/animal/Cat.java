package com.gmail.gloriyaarmen.lessons.lesson_01.animal;

public class Cat extends Animal {
String color;

@Override
    public void describe() {
        System.out.println("I'm a " + color + " cat. My name is " + name + ". My age is " + age);
    }
}
