package com.gmail.gloriyaarmen.lessons.lesson_01.animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("dog", 1),
                new Animal("cat", 1)
        };
        print(animals);

        Cat cat = new Cat();
        cat.name = "pretty cat";
        cat.age = 2;
        cat.color = "black";
        cat.describe();

    }
    private static void print(Animal[] animals) {
        System.out.println("!");
        for (Animal animal : animals) {
            animal.describe();
        }
    }
}
