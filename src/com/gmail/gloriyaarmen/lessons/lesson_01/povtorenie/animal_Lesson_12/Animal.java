package com.gmail.gloriyaarmen.lessons.lesson_01.povtorenie.animal_Lesson_12;

public class Animal {
    String name;
    int age;

//    public Animal() {
//        this.name = "default name";
//        this.age = -1;
//    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void describe() {
        System.out.println("I'm " + name + ". My age is " + age);
    }

    public void say() {
        System.out.println("Default text nemra");
    }
}
